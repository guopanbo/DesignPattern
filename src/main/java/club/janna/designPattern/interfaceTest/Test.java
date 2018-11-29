package club.janna.designPattern.interfaceTest;

/**
 * @author: 郭攀博
 * @create: 2018-11-30 07:46
 **/
public class Test {
    public static void main(String[] args) {
        ICar car = new MyCar();
        car.run();
        car.stop();

        ICar car2 = new ICar() {
            @Override
            public void stop() {
                System.out.println("Car2 stop");
            }
        };
        car2.run();
        car2.stop();
    }
}
