package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leifengyang
 * @email liuchenxi@atguigu.com
 * @date 2020-02-15 16:45:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
