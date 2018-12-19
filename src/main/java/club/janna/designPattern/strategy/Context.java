package club.janna.designPattern.strategy;

/**
 * @author: 郭攀博
 * @create: 2018-12-20 07:20
 **/
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
