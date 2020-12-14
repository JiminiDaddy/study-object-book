package com.chpark.study.ticket;

import java.time.Duration;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:25 AM
 */

class Movie {
    private String title;

    private Money fee;

    private Duration runningTime;

    private DiscountPolicy discountPolicy;

    /**
     * 영화 (예매할 영화)
     * @param title 영화 제목
     * @param fee 티켓 정가
     * @param runningTime 상영 시간
     * @param discountPolicy 할인 정책
     */
    Movie(String title, Money fee, Duration runningTime, DiscountPolicy discountPolicy) {
        this.title = title;
        this.fee = fee;
        this.runningTime = runningTime;
        this.discountPolicy = discountPolicy;
    }

    Money getFee() {
        return fee;
    }

    /**
     * 할인이 적용되어 결제할 실제 영화 티켓 가격
     * @param screening 상영
     * @return 결제 금액
     */
    Money calculateMovieFee(Screening screening) {
        // 상영할 영화의 할인정책을 통해 할인된 금액을 뺀다.
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
