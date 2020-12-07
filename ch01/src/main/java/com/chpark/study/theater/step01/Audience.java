package com.chpark.study.theater.step01;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:08 AM
 */

/**
 * 관람객
 */
public class Audience {
    private Bag bag;        // 소지한 가방 (현금, 티켓, 초대장 등 소지 가능)

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
