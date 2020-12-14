package com.chpark.study.ticket;

import java.time.LocalDateTime;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:10 AM
 */

class Screening {
    private Movie movie;

    private int sequence;

    private LocalDateTime whenScreened;

    /**
     * 상영
     * @param movie 상영할 영화
     * @param sequence 영화가 상영될 순서
     * @param whenScreened 영화가 상영될 시작시간
     */
    Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    LocalDateTime getStartTime() {
        return  whenScreened;
    }

    boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    Money getMovieFee() {
        return movie.getFee();
    }

    /**
     * 영화 예매
     * @param customer 예매할 고객
     * @param audienceCount 관람객 수(예매할 티켓 수)
     * @return 예매 정보
     */
    Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        // 티켓 수에 맞도록 결제 금액을 구한다.
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
