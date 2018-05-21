package reflect.dynamic.CGLIB;

import reflect.Count;
import reflect.CountImpl;
import reflect.CountService;

/**
 * User: 姚波旭
 * Date: 2018/5/17 15:25
 * Description:
 * Modify By:
 */
public class TestCountProxy {
    public static void main(String[] args)
    {
        //1、可以代理没有实现接口的类
        CountProxy countProxy = new CountProxy();
        Count count1 = (Count)countProxy.getInstance(new Count());
        count1.queryCount();
        count1.updateCount();

        //2、测试有接口实现的类(也可以支持)
        CountProxy countProxy_2 = new CountProxy();
        CountService countimpl = (CountService)countProxy.getInstance(new CountImpl());
        countimpl.queryCount();
        countimpl.updateCount();
    }
}
