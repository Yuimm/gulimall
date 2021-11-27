package com.hct.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.common.utils.PageUtils;
import com.hct.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:15:52
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

