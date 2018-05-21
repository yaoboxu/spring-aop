package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *  通知：睡觉前后的的辅助动作：脱衣服、穿衣服、洗脸
 * User: 姚波旭
 * Date: 2018/5/18 16:41
 * Description:
 * Modify By:
 */
public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice{

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("通常起床后要穿衣服");
    }
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("通常睡觉之前要脱衣服");
    }

}
