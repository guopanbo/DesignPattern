package club.janna.designPattern.observer;

/**
 * @author: 郭攀博
 * @create: 2019-01-12 09:16
 **/
public class WangSi extends Observer {
    @Override
    public void doSomeThing(String str) {
        System.out.println("WangSi received message: " + str);
    }
}
