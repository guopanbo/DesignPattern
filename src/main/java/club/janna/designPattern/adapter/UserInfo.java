package club.janna.designPattern.adapter;

/**
 * @author: 郭攀博
 * @create: 2018-12-21 07:14
 **/
public class UserInfo implements IUserInfo {
    @Override
    public String getName() {
        return "姓名";
    }

    @Override
    public String getPhone() {
        return "电话";
    }

    @Override
    public String getAddress() {
        return "地址";
    }
}
