package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:41
 **/
public interface HumanFactory<T> {
    T createWhite();
    T createBlack();
    T createYellow();
}
