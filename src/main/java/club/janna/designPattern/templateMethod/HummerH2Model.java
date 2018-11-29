package club.janna.designPattern.templateMethod;

/**
 * @author: 郭攀博
 * @create: 2018-11-30 06:55
 **/
public class HummerH2Model extends HummerModel {
    public void start() {
        System.out.println("h2 启动");
    }

    public void engineBoom() {
        System.out.println("h2 引擎发动");
    }

    public void whistle() {
        System.out.println("h2 鸣笛");
    }

    public void stop() {
        System.out.println("h2 停止");
    }

    @Override
    protected boolean needWhistle() {
        return false;
    }
}
