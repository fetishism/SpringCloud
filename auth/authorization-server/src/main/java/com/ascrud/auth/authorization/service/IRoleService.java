package com.ascrud.auth.authorization.service;

import com.ascrud.auth.authorization.entity.Role;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface IRoleService {

    Set<Role> queryUserRolesByUserId(String userId);

}
