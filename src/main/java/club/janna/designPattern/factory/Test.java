package club.janna.designPattern.factory;

public class Test {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new SimpleHumanFactory();

        System.out.println("----生产白人----");
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.say();

        System.out.println("----生产黑人----");
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.say();

        System.out.println("----生产黄人----");
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.say();
    }
}
