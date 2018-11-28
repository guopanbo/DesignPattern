package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:53
 **/
public class BlackFemaleHuman extends AbstractFemaleHuman {
    public void getColor() {
        System.out.println("black");
    }

    public void say() {
        System.out.println("!@#!@#!");
    }
}
