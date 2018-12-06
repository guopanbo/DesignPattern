package club.janna.designPattern.proxy.dynamic;

/**
 * @author: 郭攀博
 * @create: 2018-12-06 07:19
 **/
public interface IPlayer {
    default void login(String username, String password) {
        System.out.printf("%s login success, username: %s, password: %s\n", getName(), username, password);
    }
    void killBoss();
    void upgrade();
    default String getName() {
        return null;
    }
}
