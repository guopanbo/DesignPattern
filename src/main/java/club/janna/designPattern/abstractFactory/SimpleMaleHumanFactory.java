package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:45
 **/
public class SimpleMaleHumanFactory extends AbstractMaleHumanFactory {
    public AbstractMaleHuman createWhite() {
        return new WhiteMaleHuman();
    }

    public AbstractMaleHuman createBlack() {
        return new BlackMaleHuman();
    }

    public AbstractMaleHuman createYellow() {
        return new YellowMaleHuman();
    }
}
