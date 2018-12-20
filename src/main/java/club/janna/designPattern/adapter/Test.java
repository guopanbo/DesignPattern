package club.janna.designPattern.adapter;

/**
 * @author: 郭攀博
 * @create: 2018-12-21 07:15
 **/
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            IUserInfo userInfo = new OtherInfo();
            System.out.println(userInfo.getName());
            System.out.println(userInfo.getPhone());
            System.out.println(userInfo.getAddress());
            System.out.println("----------------------");

        }
    }
}
