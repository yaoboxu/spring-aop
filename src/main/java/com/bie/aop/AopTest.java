package com.bie.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: 姚波旭
 * Date: 2018/5/21 11:24
 * Description:
 * Modify By:
 */
public class AopTest {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        SleepAble dao =  (SleepAble) ac.getBean("human");
        System.out.println(dao.getClass());
        dao.sleep();
    }
}
