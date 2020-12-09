package com.chpark.study.theater.step01;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:08 AM
 */

class Audience {
    private Bag bag;        // 소지한 가방 (현금, 티켓, 초대장 등 소지 가능)

    Audience(Bag bag) {
        this.bag = bag;
    }

    Bag getBag() {
        return bag;
    }
}
