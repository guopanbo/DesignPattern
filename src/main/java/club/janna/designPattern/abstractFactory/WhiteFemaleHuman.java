package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:53
 **/
public class WhiteFemaleHuman extends AbstractFemaleHuman {
    public void getColor() {
        System.out.println("white");
    }

    public void say() {
        System.out.println("english");
    }
}
