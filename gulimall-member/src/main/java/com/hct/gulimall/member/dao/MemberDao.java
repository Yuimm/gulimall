package com.hct.gulimall.member.dao;

import com.hct.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 18:15:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
