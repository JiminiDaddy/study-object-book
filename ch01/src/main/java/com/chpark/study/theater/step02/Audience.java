package com.chpark.study.theater.step02;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:08 AM
 */

class Audience {
    private Bag bag;        // 소지한 가방 (현금, 티켓, 초대장 등 소지 가능)

    // Bag Getter를 제거함으로써, 외부에서 더이상 관람객의 가방에 접근할 수 없다.
    // 가방 내 소지품(티켓/초대장/현금)은 관람객만 열어볼 수 있다.
    Audience(Bag bag) {
        this.bag = bag;
    }

    Long buy(Ticket ticket) {
        // 초대장의 소지여부, 티켓교환, 잔액관리 등 기능은 가방으로 위임했다.
        return bag.hold(ticket);
    }

    Long remainAmount() {
        return bag.getAmount();
    }

    boolean hasTicket() {
        return bag.hasTicket();
    }
}
