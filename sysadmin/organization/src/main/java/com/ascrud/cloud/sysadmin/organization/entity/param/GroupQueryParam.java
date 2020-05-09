package com.ascrud.cloud.sysadmin.organization.entity.param;

import com.ascrud.cloud.sysadmin.organization.entity.po.Group;
import com.ascrud.cloud.common.web.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupQueryParam extends BaseParam<Group> {
    private String name;
}
