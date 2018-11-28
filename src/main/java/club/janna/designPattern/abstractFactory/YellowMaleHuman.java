package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:37
 **/
public class YellowMaleHuman extends AbstractMaleHuman {
    public void getColor() {
        System.out.println("yellow");
    }

    public void say() {
        System.out.println("中文");
    }
}
