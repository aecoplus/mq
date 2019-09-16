package com.aecoplus.mq.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author aecoplus
 */
@Data
public class User {
    private Long id;
    private String nickname;
    private String phone;
    private String email;
    private Integer sex;
    private LocalDate birthday;
    private Integer isDeleted;
    private LocalDateTime registerTime;
}
