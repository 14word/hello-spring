package org.hyc.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hyc
 * @description 方法注解
 * @date 2021-01-04 16:17
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {


    /**
     * 请求的路径
     *
     * @return 默认是空串
     */
    String value() default "";

    /**
     * 请求的方法
     *
     * @return 默认是get方法
     */
    RequestMethod method() default RequestMethod.GET;

}
