package club.janna.designPattern.proxy.simple;

/**
 * @author: 郭攀博
 * @create: 2018-12-06 07:27
 **/
public class PlayerProxy implements IPlayer {

    private IPlayer player;

    public PlayerProxy(IPlayer player) {
        this.player = player;
    }

    @Override
    public void killBoss() {
        System.out.printf("help %s kill a boos\n", player.getName());
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        System.out.printf("help %s upgrade a level\n", player.getName());
        this.player.upgrade();
    }

    @Override
    public String getName() {
        return player.getName();
    }
}
