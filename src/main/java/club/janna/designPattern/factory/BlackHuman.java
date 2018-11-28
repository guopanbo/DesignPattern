package club.janna.designPattern.factory;

public class BlackHuman implements Human {
    public void getColor() {
        System.out.println("黑人的皮肤是黑色的");
    }

    public void say() {
        System.out.println("黑人说话，一般听不懂");
    }
}
