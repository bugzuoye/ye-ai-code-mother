package com.zuoye.yeaicodemother.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: AuthCheck
 * @description: 权限校验注解
 * @author: zhangjy
 * @create: 2025.11.08 17:09
 */
// 只能用于方法上（不能用于类、字段等其他元素）
@Target(ElementType.METHOD)
// 注解的生命周期，运行时有效
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * 必须有某个角色
     */
    String mustRole() default "";
}
