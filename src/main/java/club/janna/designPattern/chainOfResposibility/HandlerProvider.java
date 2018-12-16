package club.janna.designPattern.chainOfResposibility;

/**
 * @author: 郭攀博
 * @create: 2018-12-17 07:43
 **/
public class HandlerProvider {

    private Handler head;

    public Handler getHandler() {
        if(head == null) {
            head = new FatherHandler();
            Handler next = new HusBandHandler();
            head.setNext(next);
            next.setNext(new SonHandler());
        }
        return head;
    }
}
