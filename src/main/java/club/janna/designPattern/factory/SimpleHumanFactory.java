package club.janna.designPattern.factory;

import java.lang.reflect.InvocationTargetException;

public class SimpleHumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> tClass) {
        try {
            return tClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
