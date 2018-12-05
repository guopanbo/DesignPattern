package club.janna.designPattern.proxy.simple;

/**
 * @author: 郭攀博
 * @create: 2018-12-06 07:26
 **/
public class Test {
    public static void main(String[] args) {
        IPlayer playerProxy = new PlayerProxy(new Player("郭攀博"));
        playerProxy.login("guopanbo", "123");
        playerProxy.killBoss();
        playerProxy.upgrade();
    }
}
