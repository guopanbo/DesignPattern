package club.janna.designPattern.chainOfResposibility;

/**
 * @author: 郭攀博
 * @create: 2018-12-17 07:33
 **/
public class SonHandler extends Handler {
    public SonHandler() {
        super(Handler.SON_HANDLE_TYPE);
    }

    @Override
    protected void handle(Women woman) {
        System.out.println("son handler");
        System.out.println("母亲的请求：" + woman.getRequest());
        System.out.println("儿子的回复：同意");
    }
}
