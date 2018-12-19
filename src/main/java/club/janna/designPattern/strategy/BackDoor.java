package club.janna.designPattern.strategy;

/**
 * @author: 郭攀博
 * @create: 2018-12-20 07:16
 **/
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，走后门");
    }
}
