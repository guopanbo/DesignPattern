package club.janna.designPattern.chainOfResposibility;

/**
 * @author: 郭攀博
 * @create: 2018-12-17 07:30
 **/
public class HusBandHandler extends Handler {
    public HusBandHandler() {
        super(Handler.HUSBAND_HANDLE_TYPE);
    }

    @Override
    protected void handle(Women woman) {
        System.out.println("husband handler");
        System.out.println("妻子的请求：" + woman.getRequest());
        System.out.println("丈夫的回复：同意");
    }
}
