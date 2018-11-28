package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:39
 **/
public class BlackMaleHuman extends AbstractMaleHuman {
    public void getColor() {
        System.out.println("black");
    }

    public void say() {
        System.out.println("%！%#￥！#￥%");
    }
}
