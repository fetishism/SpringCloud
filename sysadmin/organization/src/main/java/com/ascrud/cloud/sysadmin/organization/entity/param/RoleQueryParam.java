package com.ascrud.cloud.sysadmin.organization.entity.param;

import com.ascrud.cloud.sysadmin.organization.entity.po.Role;
import com.ascrud.cloud.common.web.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleQueryParam extends BaseParam<Role> {
    private String code;
    private String name;
}
