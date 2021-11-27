package com.hct.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.common.utils.PageUtils;
import com.hct.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:15:52
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

