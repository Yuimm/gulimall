package com.hct.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.common.utils.PageUtils;
import com.hct.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:15:52
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

