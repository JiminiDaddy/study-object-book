package com.chpark.study.theater.step02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:10 AM
 */

class TicketOffice {
    private Long amount;        // 티켓의 판매 금액

    private List<Ticket> tickets = new ArrayList<>();   // 보유한 티켓

    TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(List.of(tickets));
    }

    void sellTicketTo(Audience audience) {
        Ticket ticket = getTicket();
        plusAmount(audience.buy(ticket));
    }

    private Ticket getTicket() {
        // TODO ArrayList의 0번째 인덱스 삭제시 성능저하 개선
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    void minusAmount(Long amount) {
        this.amount -= amount;
    }

    Long getAmount() {
        return amount;
    }

    int remainTicketsAmount()  {
        return tickets.size();
    }
}
