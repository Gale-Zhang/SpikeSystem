package com.gale.test;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    @Insert("insert into order_details (`consumer_id`, `commodity_id`, `callback_url`) " +
        "values (#{consumerId}, #{commodityId}, #{callbackUrl})")
    void saveOrder(Order order);
}
