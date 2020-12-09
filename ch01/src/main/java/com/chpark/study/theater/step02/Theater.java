package com.chpark.study.theater.step02;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:17 AM
 */

class Theater {
    private TicketSeller ticketSeller;

    Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    void enter(Audience audience) {
        // 관람객이 입장하면 소극장에 있는 판매원이 관람객과 거래를 시작한다.
        ticketSeller.sellTo(audience);
    }
}
