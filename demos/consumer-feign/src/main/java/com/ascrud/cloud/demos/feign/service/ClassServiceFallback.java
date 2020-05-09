package com.ascrud.cloud.demos.feign.service;

import com.ascrud.cloud.common.core.entity.vo.Result;
import com.ascrud.cloud.common.core.exception.SystemErrorType;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ClassServiceFallback implements ClassService {
    @Override
    public Result users(String name) {
        return Result.fail(SystemErrorType.SYSTEM_BUSY);
    }

    @Override
    public Result users(Map map) {
        return Result.fail(SystemErrorType.SYSTEM_BUSY);
    }
}
