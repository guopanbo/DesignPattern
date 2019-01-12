package club.janna.designPattern.observer;


/**
 * @author: 郭攀博
 * @create: 2019-01-12 08:53
 **/
public class HanFeiZi extends AbstractHanFeiZi {
    @Override
    public void haveBreakfast() {
        System.out.println("HanFeiZi: have breakfast");
        super.notifyObservers("have breakfast");
    }

    @Override
    public void haveFun() {
        System.out.println("HanFeiZi: have fun");
        super.notifyObservers("have fun");
    }
}
