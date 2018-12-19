package club.janna.designPattern.strategy.example;

/**
 * @author: 郭攀博
 * @create: 2018-12-20 07:27
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(MathEnum.ADD.exec(1, 2));
        System.out.println(MathEnum.SUB.exec(2, 1));
    }
}
