package com.chpark.study.theater.step01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertFalse(audience1.getBag().hasInvitation());

        Bag invitationWithBag  = new Bag(10000L, invitation);
        Audience audience2 = new Audience(invitationWithBag);
        Assertions.assertTrue(audience2.getBag().hasInvitation());

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

        Assertions.assertEquals(5000L, audience1.getBag().getAmount());
        Assertions.assertTrue(audience1.getBag().hasTicket());

        Assertions.assertEquals(10000L, audience2.getBag().getAmount());
        Assertions.assertTrue(audience2.getBag().hasTicket());
    }
}
