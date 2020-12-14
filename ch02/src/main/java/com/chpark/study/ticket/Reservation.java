package com.chpark.study.ticket;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:21 AM
 */

class Reservation {
    private Customer customer;

    private Screening screening;

    private Money fee;

    private int audienceCount;

    /**
     * 예매
     * @param customizer 예매할 고객
     * @param screening 상영
     * @param fee 결제 금액
     * @param audienceCount 관람객 수 (티켓 수)
     */
    Reservation(Customer customizer, Screening screening, Money fee, int audienceCount) {
        this.customer = customizer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    Money getFee() {
        return this.fee;
    }
}
