package com.chpark.study.theater.step02;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 2:16 AM
 */

class TicketSeller {
    private TicketOffice ticketOffice;

    // 매표소 Getter를 제거함으로써, 외부에서는 더이상 매표소에 직접 접근할 수 없다.
    // 매표소에 접근할 수 있는 사람은 오직 판매원만 가능하다.
    TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /* 관람객과 판매원의 거래를 소극장이 알 필요가 없으므로 거래내용은 소극장->판매자로 이동했다.
     * 티켓을 꺼내 매출을 올리는 일을 캡슐화하여 판매원만 가능하게 되었다.
     */
    void sellTo(Audience audience) {
        // 티켓을 1장 꺼내온다.
        //Ticket ticket = ticketOffice.getTicket();
        // 꺼낸 티켓을 관람객에게 전달하고, 받은 돈은 적립한다.
        // 판매원은 관람객의 가방에 뭐가 들었는지 알 필요가 없으므로 Bag에 대한 접근/처리는 관람객 스스로가 할 수 있도록 한다.
        //ticketOffice.plusAmount(audience.buy(ticket));

        ticketOffice.sellTicketTo(audience);
    }
}
