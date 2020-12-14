package com.chpark.study.ticket;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/14
 * Time : 3:33 PM
 */

public class NoneDiscountPolicy implements DiscountPolicy {

    /**
     * 비 할인정책 (할인이 적용되지 않는 상영)
     * @param screening 상영
     * @return 할인이 적용된 할인금액
     */
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
