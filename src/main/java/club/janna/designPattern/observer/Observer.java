package club.janna.designPattern.observer;

import java.util.Observable;

/**
 * @author: 郭攀博
 * @create: 2019-01-12 09:04
 **/
public abstract class Observer implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        this.doSomeThing((String) arg);
    }

    public abstract void doSomeThing(String str);
}
