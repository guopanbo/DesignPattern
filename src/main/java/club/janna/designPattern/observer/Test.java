package club.janna.designPattern.observer;


/**
 * @author: 郭攀博
 * @create: 2019-01-12 09:08
 **/
public class Test {
    public static void main(String[] args) {
        AbstractHanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(new LiSi());
        hanFeiZi.addObserver(new WangSi());
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
