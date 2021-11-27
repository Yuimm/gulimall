package com.hct.gulimall.order.dao;

import com.hct.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:25:50
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
