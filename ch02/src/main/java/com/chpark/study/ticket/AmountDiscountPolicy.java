package com.chpark.study.ticket;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:42 AM
 */

class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    Money getDiscountAmount(Screening screening) {
        // 할인조건이 충족되면 할인할 금액을 반환한다.
        return discountAmount;
    }
}
