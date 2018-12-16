package club.janna.designPattern.chainOfResposibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: 郭攀博
 * @create: 2018-12-17 07:41
 **/
public class Test {
    public static void main(String[] args) {
        List<Women> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(new Random().nextInt(3), "我要去逛街"));
        }
        Handler handler = new HandlerProvider().getHandler();
        list.forEach(women -> handler.handleMessage(women));
    }
}
