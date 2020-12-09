package com.chpark.study.theater.step01;

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

    boolean hasInvitation() {
        return invitation != null;
    }

    boolean hasTicket() {
        return ticket != null;
    }

    void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    void plusAmount(long amount) {
        this.amount += amount;
    }

    void minusAmount(long amount) {
        this.amount -= amount;
    }

    Long getAmount() {
        return amount;
    }
}
