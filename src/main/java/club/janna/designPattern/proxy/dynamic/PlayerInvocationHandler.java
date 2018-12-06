package club.janna.designPattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author: 郭攀博
 * @create: 2018-12-07 07:32
 **/
public class PlayerInvocationHandler implements InvocationHandler {

    private IPlayer player;

    public PlayerInvocationHandler(IPlayer player) {
        this.player = player;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("login".equals(method.getName()))
            System.out.printf("[info] - %s - %s login\n", new Date(), args[0]);
        if(IPlayer.class.getDeclaredMethod("killBoss").equals(method))
            System.out.println("you kill a boss");
        return method.invoke(player, args);
    }
}
