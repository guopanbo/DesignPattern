package club.janna.designPattern.templateMethod;

/**
 * @author: 郭攀博
 * @create: 2018-11-30 06:53
 **/
public class HummerH1Model extends HummerModel {

    private boolean needWhistle = true;

    public void start() {
        System.out.println("h1 启动");
    }

    public void engineBoom() {
        System.out.println("h1 引擎发动");
    }

    public void whistle() {
        System.out.println("h1 鸣笛");
    }

    public void stop() {
        System.out.println("h1 停止");
    }

    @Override
    protected boolean needWhistle() {
        return needWhistle;
    }

    public void setWhistle(boolean needWhistle) {
        this.needWhistle = needWhistle;
    }
}
