package com.ascrud.cloud.gateway.admin.dao;

import com.ascrud.cloud.gateway.admin.entity.po.GatewayRoute;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GatewayRouteMapper extends BaseMapper<GatewayRoute> {
}