package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: 姚波旭
 * Date: 2018/5/21 9:33
 * Description:
 * Modify By:
 */
public class TestMain {
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        SleepAble sleepAble = (SleepAble)context.getBean("humanProxy");
        sleepAble.sleep();

    }
}
