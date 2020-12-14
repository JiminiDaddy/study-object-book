package com.chpark.study.ticket;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:37 AM
 */

class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;

    private LocalTime startTime;

    private LocalTime endTime;

    /**
     * 기간 할인 조건
     * @param dayOfWeek 할인이 적용될 요일
     * @param startTime 할인이 적용될 영화 시작시간
     * @param endTime 할인이 적용될 영화 종료시간
     */
    PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        // 상영될 영화가 정해진 요일/날짜 중 할인시간대에 포함되면 할인을 적용한다.
        return dayOfWeek.equals(screening.getStartTime().getDayOfWeek()) &&
               startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
               endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0
               ;
    }
}
