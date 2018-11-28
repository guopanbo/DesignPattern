package club.janna.designPattern.factory;

public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的");
    }

    public void say() {
        System.out.println("黄种人说话，一般是双字节");
    }
}
