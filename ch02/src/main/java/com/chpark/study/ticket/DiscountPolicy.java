package com.chpark.study.ticket;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/14
 * Time : 3:43 PM
 */

interface DiscountPolicy {
   /* NoneDiscountPolicy이 주가되었고, DisCountPolicy의 기본값(할인조건없는경우)이 NoneDiscountPolicy를 포함하고 있다.
    * 따라서 DiscountPolicy를 인터페이스로 변경하고, 아래 메서드는 인터페이스를 상속받는 DefaultDiscountPolicyd와 NoneDiscountPolicy 클래스에서 구현하도록 한다.
    */
   Money calculateDiscountAmount(Screening screening);
}
