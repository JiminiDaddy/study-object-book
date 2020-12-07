package com.chpark.study.theater.step01;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:17 AM
 */

/**
 * 소극장
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        // 초대장이 있는 경우
        if (audience.getBag().hasInvitation()) {
            // 초대장과 티켓이 교환되므로 티켓은 1장 줄어들지만 매출은 발생하지 않는다.
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }
        // 초대장이 없는 경우
        else {
            // 관람객이 티켓을 구매하므로 티켓은 1장 줄어들고, 매출이 발생한다. 관람객이 소지한 현금도 티켓가격만큼 줄어든다.
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
