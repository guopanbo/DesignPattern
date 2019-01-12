package club.janna.designPattern.observer;

import java.util.Observable;

public abstract class AbstractHanFeiZi extends Observable {

    @Override
    public void notifyObservers(Object arg) {
        super.setChanged();
        super.notifyObservers(arg);
        super.clearChanged();
    }

    /**
     * 吃早饭
     */
    abstract void haveBreakfast();

    /**
     * 娱乐
     */
    abstract void haveFun();
}
