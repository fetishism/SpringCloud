package com.ascrud.cloud.sysadmin.organization.entity.param;

import com.ascrud.cloud.sysadmin.organization.entity.po.Menu;
import com.ascrud.cloud.common.web.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuQueryParam extends BaseParam<Menu> {
    private String name;
}
