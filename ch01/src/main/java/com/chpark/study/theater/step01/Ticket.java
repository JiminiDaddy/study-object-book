package com.chpark.study.theater.step01;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:03 AM
 */

/**
 * 티켓
 */
public class Ticket {
    private final Long fee;       // 가격

    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return fee;
    }
}
