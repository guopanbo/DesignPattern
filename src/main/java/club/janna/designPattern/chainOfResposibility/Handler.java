package club.janna.designPattern.chainOfResposibility;

import lombok.Setter;

/**
 * @author: 郭攀博
 * @create: 2018-12-17 07:21
 **/
public abstract class Handler {
    protected final static int FATHER_HANDLE_TYPE = 0;
    protected final static int HUSBAND_HANDLE_TYPE = 1;
    protected final static int SON_HANDLE_TYPE = 2;

    private int handleType;

    @Setter
    private Handler next;

    public Handler(int handleType) {
        this.handleType = handleType;
    }

    public final void handleMessage(Women women) {
        if(women.getType() == this.handleType)
            this.handle(women);
        else if(this.next != null)
            this.next.handleMessage(women);
        else
            System.out.println("没有handler了");
    }

    protected abstract void handle(Women woman);
}
