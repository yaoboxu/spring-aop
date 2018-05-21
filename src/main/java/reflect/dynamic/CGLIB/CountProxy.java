package reflect.dynamic.CGLIB;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 基本的思想：给目标对象创建一个子类，这样，这类就可以调用任何方法了。
 * User: 姚波旭
 * Date: 2018/5/17 14:59
 * Description:
 * Modify By:
 */
public class CountProxy implements MethodInterceptor
{
    Object target;
    public Object getInstance(Object target)
    {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before ....");
        //这里不是调用的target,而是obj，这个obj是enhancer生成的target的子类
        Object result = methodProxy.invokeSuper(obj, args);
        System.out.println("after....");
        return result;
    }
}
