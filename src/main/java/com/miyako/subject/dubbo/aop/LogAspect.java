package com.miyako.subject.dubbo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName LogAspect
 * Description //TODO
 * Author weila
 * Date 2019-08-09-0009 20:06
 */
@Aspect
@Component
public class LogAspect{

    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Before("execution(public * com.miyako.subject..*.*(..)) && @annotation(methodLog)")
    public void before(JoinPoint joinPoint, MethodLog methodLog){
        logger.info("==========================================");
        logger.info("操作者=>"+methodLog.value());
        logger.info("类型=>"+methodLog.operationType());
        logger.info("方法名=>"+methodLog.operationName());
        logger.info("参数=>"+methodLog.operationArgs());
        logger.info("==========================================");
    }
}
