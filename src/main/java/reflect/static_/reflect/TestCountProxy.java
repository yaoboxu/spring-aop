package reflect.static_.reflect;

import reflect.CountImpl;
import reflect.static_.reflect.CountProxy;

/**
 * User: 姚波旭
 * Date: 2018/5/17 14:17
 * Description:
 * Modify By:
 */
public class TestCountProxy {
    public static void main(String[] args)
    {
        CountImpl count = new CountImpl();
        CountProxy proxy = new CountProxy(count);
        proxy.queryCount();
        proxy.updateCount();
    }
}
