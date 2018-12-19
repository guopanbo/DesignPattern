package club.janna.designPattern.strategy;

/**
 * @author: 郭攀博
 * @create: 2018-12-20 07:21
 **/
public class Test {
    public static void main(String[] args) {
        Context context = new Context(new BackDoor());
        System.out.println("刚到吴国，打开第一个锦囊");
        context.operate();
        context = new Context(new GivenGreenLight());
        System.out.println("刘备乐不思蜀，打开第二个锦囊");
        context.operate();
        context = new Context(new BlockEnemy());
        System.out.println("追兵来了，打开第三个锦囊");
        context.operate();
    }
}
