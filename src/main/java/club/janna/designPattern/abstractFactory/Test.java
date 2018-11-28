package club.janna.designPattern.abstractFactory;

/**
 * @author: 郭攀博
 * @create: 2018-11-29 06:47
 **/
public class Test {
    public static void main(String[] args) {
        HumanFactory<AbstractMaleHuman> maleHumanHumanFactory = new SimpleMaleHumanFactory();

        Human blackMale = maleHumanHumanFactory.createBlack();
        blackMale.say();
        blackMale.getColor();
        blackMale.getSex();
        System.out.println();

        Human whiteMale = maleHumanHumanFactory.createWhite();
        whiteMale.say();
        whiteMale.getColor();
        whiteMale.getSex();
        System.out.println();

        Human yellowMale = maleHumanHumanFactory.createYellow();
        yellowMale.say();
        yellowMale.getColor();
        yellowMale.getSex();
        System.out.println();

        HumanFactory<AbstractFemaleHuman> femaleFacotryHumanFactory = new SimpleFemaleFactory();
        Human blackFemale = femaleFacotryHumanFactory.createBlack();
        blackFemale.say();
        blackFemale.getColor();
        blackFemale.getSex();
        System.out.println();

        Human whiteFemale = femaleFacotryHumanFactory.createWhite();
        whiteFemale.say();
        whiteFemale.getColor();
        whiteFemale.getSex();
        System.out.println();

        Human yellowFemale = femaleFacotryHumanFactory.createYellow();
        yellowFemale.say();
        yellowFemale.getColor();
        yellowFemale.getSex();
        System.out.println();
    }
}
