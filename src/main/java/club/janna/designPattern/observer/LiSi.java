package club.janna.designPattern.observer;


/**
 * @author: 郭攀博
 * @create: 2019-01-12 09:03
 **/
public class LiSi extends Observer {

    @Override
    public void doSomeThing(String str) {
        System.out.println("LiSi received message: " + str);
    }
}
