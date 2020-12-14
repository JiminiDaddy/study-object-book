package com.chpark.study.ticket;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/12
 * Time : 2:24 AM
 */

class Customer {
    private Long id;

    private String name;

    /**
     * 고객 (관람객)
     * @param id 고객 Id
     * @param name 고객 이름
     */
    Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
