package com.miyako.subject.dubbo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName MethodLog
 * Description //TODO
 * Author weila
 * Date 2019-08-09-0009 20:16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodLog {

    public String value() default "null";

    public String operationType() default "null";

    public String operationName() default "null";

    public String operationArgs() default "null";
}
