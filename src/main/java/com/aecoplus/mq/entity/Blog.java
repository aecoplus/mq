package com.aecoplus.mq.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author aecoplus
 */
@Data
public class Blog {
    private Long id;
    private Long userId;
    private String title;
    private String blog;
    private Integer isDeleted;
    private LocalDateTime createTime;
}
