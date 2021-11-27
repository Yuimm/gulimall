package com.hct.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.common.utils.PageUtils;
import com.hct.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:29:23
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

