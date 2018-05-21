package reflect.static_.reflect;

import reflect.CountImpl;
import reflect.CountService;

/**
 * 静态代理的思想：持有被代理对象,直接使用代理对象调用原方法，
 * 只不过不暴露出去，把代理对象暴露出去。
 * User: 姚波旭
 * Date: 2018/5/17 14:06
 * Description:
 * Modify By:
 */
public class CountProxy implements CountService {
    CountImpl target;
    public CountProxy(CountImpl countImpl)
    {
        this.target = countImpl;
    }


    @Override
    public void queryCount() {
        target.queryCount();
    }

    @Override
    public void updateCount() {
        target.updateCount();
    }
}
