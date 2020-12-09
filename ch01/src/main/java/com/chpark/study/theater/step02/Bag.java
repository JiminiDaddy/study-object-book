package com.chpark.study.theater.step02;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:05 AM
 */

class Bag {
    private Long amount;            // 소지한 현금

    private Invitation invitation;  // 소지한 초대장

    private Ticket ticket;          // 소지한 티켓

    // 현금만 소지한 경우 (초대 X)
    Bag(Long amount) {
        this.amount = amount;
    }
    // 현금과 초대장을 소지한 경우 (초대 O)
    Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        }
        setTicket(ticket);
        minusAmount(ticket.getFee());
        return ticket.getFee();
    }

    Long getAmount() {
        return amount;
    }

    boolean hasTicket() {
        return ticket != null;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

   private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(long amount) {
        this.amount -= amount;
    }
}
