package com.chpark.study.ticket;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:30 AM
 */

interface DiscountCondition {
    /**
     * 할인 조건
     * @param screening 상영
     * @return 상영정보가 할인조건을 만족하면 true, 만족하지 않으면 false
     *
     */
    boolean isSatisfiedBy(Screening screening);
}
