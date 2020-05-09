package com.ascrud.auth.authorization.service.impl;

import com.ascrud.auth.authorization.provider.OrganizationProvider;
import com.ascrud.auth.authorization.entity.User;
import com.ascrud.auth.authorization.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private OrganizationProvider organizationProvider;

    @Override
    public User getByUniqueId(String uniqueId) {
        return organizationProvider.getUserByUniqueId(uniqueId).getData();
    }
}
