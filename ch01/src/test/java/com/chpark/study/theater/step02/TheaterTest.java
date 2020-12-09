package com.chpark.study.theater.step02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.engine.JupiterTestEngine;

import java.time.LocalDateTime;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:20 AM
 */

class TheaterTest {
    @Test
    void 티켓판매() {
        Bag onlyAmountBag  = new Bag(10000L);
        Audience audience1 = new Audience(onlyAmountBag);
        Invitation invitation = new Invitation(LocalDateTime.now());

        Bag invitationWithBag  = new Bag(10000L, invitation);
        Audience audience2 = new Audience(invitationWithBag);

        Ticket[] tickets = new Ticket[10];
        for (int i = 0; i < tickets.length; ++i) {
            tickets[i] = new Ticket(5000L);
        }
        TicketOffice ticketOffice = new TicketOffice(0L, tickets);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        Theater theater = new Theater(ticketSeller);
        theater.enter(audience1);
        Assertions.assertEquals(5000L, ticketOffice.getAmount());
        Assertions.assertEquals(9, ticketOffice.remainTicketsAmount());

        theater.enter(audience2);
        Assertions.assertEquals(5000L, ticketOffice.getAmount());
        Assertions.assertEquals(8, ticketOffice.remainTicketsAmount());

        Assertions.assertEquals(5000L, audience1.remainAmount());
        Assertions.assertTrue(audience1.hasTicket());

        Assertions.assertEquals(10000L, audience2.remainAmount());
        Assertions.assertTrue(audience2.hasTicket());
    }
}
