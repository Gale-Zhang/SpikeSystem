package com.gale.test;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private long id;
    private long consumerId;
    private long commodityId;
    private int quantity;
    private Date timestamp;
    private String status;
    private String callbackUrl;
    private Date createTime;
    private Date updateTime;
}
