package com.bie.aop;

import org.springframework.stereotype.Component;

/**
 * User: 姚波旭
 * Date: 2018/5/21 14:15
 * Description:
 * Modify By:
 */
@Component
public class Human implements SleepAble {
    @Override
    public void sleep() {
        System.out.println("准备开始睡觉");
    }
}
