package aop;

import org.springframework.stereotype.Component;

import aop.SleepAble;

/**
 * User: 姚波旭
 * Date: 2018/5/18 16:38
 * Description:
 * Modify By:
 */
public class Human implements SleepAble{
    @Override
    public void sleep() {
        System.out.println("梦此一游！");
    }
}
