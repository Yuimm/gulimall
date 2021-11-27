package com.hct.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.common.utils.PageUtils;
import com.hct.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:08:02
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

