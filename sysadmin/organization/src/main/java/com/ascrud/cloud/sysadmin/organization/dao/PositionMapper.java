package com.ascrud.cloud.sysadmin.organization.dao;

import com.ascrud.cloud.sysadmin.organization.entity.po.Position;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PositionMapper extends BaseMapper<Position> {
}