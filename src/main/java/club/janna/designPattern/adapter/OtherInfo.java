package club.janna.designPattern.adapter;

/**
 * @author: 郭攀博
 * @create: 2018-12-21 07:20
 **/
public class OtherInfo extends OtherUserInfo implements IUserInfo {
    @Override
    public String getName() {
        return super.getBaseInfo().get("name");
    }

    @Override
    public String getPhone() {
        return super.getWorkInfo().get("phone");
    }

    @Override
    public String getAddress() {
        return super.getHomeInfo().get("address");
    }
}
