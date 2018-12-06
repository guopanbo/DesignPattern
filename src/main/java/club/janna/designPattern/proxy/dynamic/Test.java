package club.janna.designPattern.proxy.dynamic;

/**
 * @author: 郭攀博
 * @create: 2018-12-07 07:38
 **/
public class Test {
    public static void main(String[] args) {
        IPlayer player = IPlayerProxy.getProxy(new Player("郭攀博"));
        player.login("guopanbo", "123");
        player.killBoss();
        player.upgrade();
    }
}
