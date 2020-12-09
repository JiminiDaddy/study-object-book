package com.chpark.study.theater.step01;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:16 AM
 */

class TicketSeller {
    private TicketOffice ticketOffice;

    TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
