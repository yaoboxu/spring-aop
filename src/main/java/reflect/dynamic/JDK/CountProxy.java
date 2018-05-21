package reflect.dynamic.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理的思想：根据目标对象的接口以及类加载器，构造代理对象，这样就可以转换为接口
 * User: 姚波旭
 * Date: 2018/5/17 14:39
 * Description:
 * Modify By:
 */
public class CountProxy implements InvocationHandler {
    Object target;
    public Object bind (Object target)
    {
        this.target = target;
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("事务开始");
        result =  method.invoke(target, args);
        System.out.println("事务结束");
        return result;
    }
}
