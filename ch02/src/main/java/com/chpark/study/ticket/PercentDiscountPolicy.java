package com.chpark.study.ticket;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:44 AM
 */

class PercentDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    /**
     * 비율 할인 정책 (정가의 X%로 할인된다.)
     * @param percent 할인율
     * @param conditions 할인 조건
     */
    PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    Money getDiscountAmount(Screening screening) {
        // 할인조건이 만족되면 영화금액에서 할인할 금액의 비율만큼 곱하여 할인금액을 반환한다.
        return screening.getMovieFee().times(percent / 100.0);
    }
}
