package com.ascrud.cloud.sysadmin.organization.entity.param;

import com.ascrud.cloud.sysadmin.organization.entity.po.Position;
import com.ascrud.cloud.common.web.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionQueryParam extends BaseParam<Position> {
    private String name;
}
