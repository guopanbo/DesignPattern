package club.janna.designPattern.chainOfResposibility;

import lombok.Getter;

/**
 * @author: 郭攀博
 * @create: 2018-12-17 07:18
 **/
public class Women {

    @Getter
    private int type;

    @Getter
    private String request;

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }
}
