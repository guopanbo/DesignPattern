package club.janna.designPattern.builder;

/**
 * @author: 郭攀博
 * @create: 2018-12-04 08:13
 **/
public class Test {
    public static void main(String[] args) {
        Director director = new Director();

        director.getBenzA().run();
        System.out.println("----------------");

        director.getBenzB().run();
        System.out.println("----------------");

        director.getBMWA().run();
        System.out.println("----------------");

        director.getBMWB().run();
        System.out.println("----------------");
    }
}
