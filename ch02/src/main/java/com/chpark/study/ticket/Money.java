package com.chpark.study.ticket;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:14 AM
 */

class Money {
    static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    private Money(BigDecimal amount) {
        this.amount = amount;
    }

    Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    @Override
    public String toString() {
        return amount.toString() + "원";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (! (obj instanceof Money)) return false;
        Money other = (Money) obj;
        return Objects.equals(amount.longValue(), other.amount.longValue());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }
}
