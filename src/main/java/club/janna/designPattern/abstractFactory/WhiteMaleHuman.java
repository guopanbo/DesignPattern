package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:40
 **/
public class WhiteMaleHuman extends AbstractMaleHuman {
    public void getColor() {
        System.out.println("white");
    }

    public void say() {
        System.out.println("english");
    }
}
