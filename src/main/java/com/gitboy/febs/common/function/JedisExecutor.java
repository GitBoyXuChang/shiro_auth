package com.gitboy.febs.common.function;

import com.gitboy.febs.common.exception.RedisConnectException;

@FunctionalInterface
public interface JedisExecutor<T, R> {
    R excute(T t) throws RedisConnectException;
}
