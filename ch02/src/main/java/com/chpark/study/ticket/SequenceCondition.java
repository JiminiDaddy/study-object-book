package com.chpark.study.ticket;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:34 AM
 */

class SequenceCondition implements DiscountCondition {
    private int sequence;

    SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        // 상영될 영화의 순서가 순서할인조건에 일치하면 할인을 적용한다.
        return screening.isSequence(sequence);
    }
}
