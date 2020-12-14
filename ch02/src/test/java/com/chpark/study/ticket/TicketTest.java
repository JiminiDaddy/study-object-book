package com.chpark.study.ticket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:50 AM
 */

class TicketTest {
    @Test
    void 영화_예매_테스트() {
        Movie avatar = new Movie(
                "아바타",
                Money.wons(10000),
                Duration.ofMinutes(120),
                new AmountDiscountPolicy(Money.wons(2000),
                        new SequenceCondition(1),
                        new SequenceCondition(2),
                        new SequenceCondition(10))
        );

        Movie kingsman = new Movie(
                "킹스맨",
                Money.wons(12000),
                Duration.ofMinutes(120),
                new PercentDiscountPolicy(10,
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(14,0), LocalTime.of(16,59)),
                        new SequenceCondition(1),
                        new PeriodCondition(DayOfWeek.FRIDAY, LocalTime.of(17,0), LocalTime.of(23,59)))
        );

        Movie starWars = new Movie(
                "스타워즈",
                Money.wons(15000),
                Duration.ofMinutes(180),
                new NoneDiscountPolicy()
        );

        Customer customer1 = new Customer(1L, "박천희");
        Screening screening1 = new Screening(avatar, 1, LocalDateTime.of(2020,12,25,10,0));
        Reservation reservation1 = screening1.reserve(customer1, 1);
        Assertions.assertTrue(Money.wons(10000-2000).equals(reservation1.getFee()));

        Customer customer2 = new Customer(2L, "User1");
        Screening screening2 = new Screening(kingsman, 1, LocalDateTime.of(2020,12,25,20,0));
        Reservation reservation2 = screening2.reserve(customer2, 2);
        Assertions.assertTrue(Money.wons(24000 - 2400).equals(reservation2.getFee()));

        Customer customer3 = new Customer(3L, "User2");
        Screening screening3 = new Screening(starWars, 1, LocalDateTime.of(2020, 12, 24, 21, 0));
        Reservation reservation3 = screening3.reserve(customer3, 2);
        Assertions.assertTrue(Money.wons(15000 * 2).equals(reservation3.getFee()));
    }
}
