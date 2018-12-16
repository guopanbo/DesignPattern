package club.janna.designPattern.chainOfResposibility;

/**
 * @author: 郭攀博
 * @create: 2018-12-17 07:28
 **/
public class FatherHandler extends Handler {
    public FatherHandler() {
        super(Handler.FATHER_HANDLE_TYPE);
    }

    @Override
    protected void handle(Women woman) {
        System.out.println("father handler");
        System.out.println("女儿的请求：" + woman.getRequest());
        System.out.println("父亲的回复：同意");
    }
}
