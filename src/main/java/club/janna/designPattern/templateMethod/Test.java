package club.janna.designPattern.templateMethod;

import java.util.Scanner;

/**
 * @author: 郭攀博
 * @create: 2018-11-30 06:56
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("H1 是否需要鸣笛？1 是， 0 否");
        int in = scanner.nextInt();

        HummerModel h1 = new HummerH1Model();
        if(in == 0)
            ((HummerH1Model) h1).setWhistle(false);
        h1.run();

        System.out.println("-------------------");

        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}
