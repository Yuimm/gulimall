package com.hct.gulimall.coupon.dao;

import com.hct.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:08:02
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
