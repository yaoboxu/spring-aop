package com.bie.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * User: 姚波旭
 * Date: 2018/5/21 11:21
 * Description:
 * Modify By:
 */

@Component
@Aspect
public class SleepHelper {
    @Pointcut("execution(* com.bie.aop.Human.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void begin(){
        System.out.println("开启事务");
    }
    @After("pointCut()")
    public void close1(){
        System.out.println("关闭事务1");
    }

    @AfterReturning("pointCut()")
    public void close(){
        System.out.println("关闭事务2");
    }
}
