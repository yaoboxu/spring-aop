package reflect;
/**
 * User: 姚波旭
 * Date: 2018/5/17 14:02
 * Description:
 * Modify By:
 */
public class CountImpl implements CountService {
    @Override
    public void queryCount() {
        System.out.println("查询账户成功");
    }

    @Override
    public void updateCount() {
        System.out.println("更新账户成功");
    }
}
