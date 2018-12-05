package club.janna.designPattern.proxy.simple;

/**
 * @author: 郭攀博
 * @create: 2018-12-06 07:20
 **/
public class Player implements IPlayer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void killBoss() {
        System.out.printf("%s kill a boss\n", this.name);
    }

    @Override
    public void upgrade() {
        System.out.printf("%s upgrade a level\n", this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
