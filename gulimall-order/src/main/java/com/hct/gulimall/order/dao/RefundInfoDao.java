package com.hct.gulimall.order.dao;

import com.hct.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:25:50
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
