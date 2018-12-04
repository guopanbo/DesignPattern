package club.janna.designPattern.builder;

/**
 * @author: 郭攀博
 * @create: 2018-12-04 08:02
 **/
public class BMWCarModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("bmw start");
    }

    @Override
    protected void engineBoom() {
        System.out.println("bmw engine boom");
    }

    @Override
    protected void whistle() {
        System.out.println("bmw whistle");
    }

    @Override
    protected void stop() {
        System.out.println("bmw stop");
    }
}
