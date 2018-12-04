package club.janna.designPattern.builder;

/**
 * @author: 郭攀博
 * @create: 2018-12-04 08:01
 **/
public class BenzCarModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("benz start");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz engine boom");
    }

    @Override
    protected void whistle() {
        System.out.println("benz whistle");
    }

    @Override
    protected void stop() {
        System.out.println("benz stop");
    }
}
