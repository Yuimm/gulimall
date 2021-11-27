package com.hct.gulimall.product.dao;

import com.hct.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Chestnut
 * @email Chestnut@gmail.com
 * @date 2021-07-26 17:14:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
