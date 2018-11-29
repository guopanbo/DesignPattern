package club.janna.designPattern.templateMethod;

/**
 * @author: 郭攀博
 * @create: 2018-11-30 06:50
 **/
public abstract class HummerModel {
    /**
     * 启动
     */
    public abstract void start();

    /**
     * 引擎发动
     */
    public abstract void engineBoom();

    /**
     * 鸣笛
     */
    public abstract void whistle();

    /**
     * 停止
     */
    public abstract void stop();

    public void run() {
        start();
        engineBoom();
        if(needWhistle())
            whistle();
        stop();
    }

    /**
     * @return 是否需要鸣笛
     */
    protected boolean needWhistle() {
        return true;
    }
}
