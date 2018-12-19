package club.janna.designPattern.strategy;

/**
 * @author: 郭攀博
 * @create: 2018-12-20 07:19
 **/
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后");
    }
}
