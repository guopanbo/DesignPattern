package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:56
 **/
public class SimpleFemaleFactory extends AbstractFemaleFacotry {
    public AbstractFemaleHuman createWhite() {
        return new WhiteFemaleHuman();
    }

    public AbstractFemaleHuman createBlack() {
        return new BlackFemaleHuman();
    }

    public AbstractFemaleHuman createYellow() {
        return new YellowFemaleHuman();
    }
}
