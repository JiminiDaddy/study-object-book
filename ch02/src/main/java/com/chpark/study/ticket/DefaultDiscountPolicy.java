package com.chpark.study.ticket;

import java.util.List;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:29 AM
 */

abstract class DefaultDiscountPolicy implements DiscountPolicy {
    private List<DiscountCondition> conditions;

    DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = List.of(conditions);
    }

    // 상영될 영화가 할인정책 중 만족하는것이 있는지 확인하고 있다면 할인을 적용한다.
    // 할인금액은 각 세부할인정책에 따라 달라질 수 있다.
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    // 할인금액은 각 세부 할인정책에서 구할 수 있다.
    abstract Money getDiscountAmount(Screening screening);
}
