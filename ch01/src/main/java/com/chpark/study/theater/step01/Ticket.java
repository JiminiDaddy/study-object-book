package com.chpark.study.theater.step01;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:03 AM
 */

class Ticket {
    private final Long fee;       // 가격

    Ticket(Long fee) {
        this.fee = fee;
    }

    Long getFee() {
        return fee;
    }
}
