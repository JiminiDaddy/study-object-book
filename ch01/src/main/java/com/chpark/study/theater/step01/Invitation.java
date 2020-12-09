package com.chpark.study.theater.step01;

import java.time.LocalDateTime;

/**
 * Created by Choen-hee Park
 * User : chpark
 * Date : 2020/12/08
 * Time : 1:59 AM
 */

class Invitation {
    private LocalDateTime when;     // 초대일자

    Invitation(LocalDateTime when) {
        this.when = when;
    }
}
