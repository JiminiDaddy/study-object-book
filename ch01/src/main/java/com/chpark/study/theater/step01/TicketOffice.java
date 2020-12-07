package com.chpark.study.theater.step01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:10 AM
 */

/**
 * 매표소
 */
public class TicketOffice {
    private Long amount;        // 티켓의 판매 금액

    private List<Ticket> tickets = new ArrayList<>();   // 보유한 티켓

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(List.of(tickets));
    }

    public Ticket getTicket() {
        // TODO ArrayList의 0번째 인덱스 삭제시 성능저하 개선
        return tickets.remove(0);
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public Long getAmount() {
        return amount;
    }

    public int remainTicketsAmount()  {
        return tickets.size();
    }
}
