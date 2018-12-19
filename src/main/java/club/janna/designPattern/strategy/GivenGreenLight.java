package club.janna.designPattern.strategy;

/**
 * @author: 郭攀博
 * @create: 2018-12-20 07:18
 **/
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太，开绿灯，放行");
    }
}
