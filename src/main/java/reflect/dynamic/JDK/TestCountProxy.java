package reflect.dynamic.JDK;

import reflect.CountImpl;
import reflect.CountService;

/**
 * User: 姚波旭
 * Date: 2018/5/17 14:44
 * Description:
 * Modify By:
 */
public class TestCountProxy {
    public static void main(String[] args)
    {
        CountProxy proxy = new CountProxy();
        //只能转换为接口类型
        CountService countService = (CountService)proxy.bind(new CountImpl());
        countService.queryCount();
        countService.updateCount();
    }
}
