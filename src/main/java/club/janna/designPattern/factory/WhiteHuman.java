package club.janna.designPattern.factory;

public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白种人的皮肤是白色的");
    }

    public void say() {
        System.out.println("白种人说话，一般都是单字节的");
    }
}
