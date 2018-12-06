package club.janna.designPattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author: 郭攀博
 * @create: 2018-12-07 07:35
 **/
public class IPlayerProxy {
    public static <T extends IPlayer> T getProxy(IPlayer player) {
        return (T)Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), new PlayerInvocationHandler(player));
    }
}
