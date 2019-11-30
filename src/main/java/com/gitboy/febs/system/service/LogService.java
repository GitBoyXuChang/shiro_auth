package com.gitboy.febs.system.service;

import com.gitboy.febs.common.domain.QueryRequest;
import com.gitboy.febs.system.domain.SysLog;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.scheduling.annotation.Async;


public interface LogService extends IService<SysLog> {

    IPage<SysLog> findLogs(QueryRequest request, SysLog sysLog);

    void deleteLogs(String[] logIds);

    @Async
    void saveLog(ProceedingJoinPoint point, SysLog log) throws JsonProcessingException;
}
