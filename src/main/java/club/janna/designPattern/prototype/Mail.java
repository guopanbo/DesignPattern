package club.janna.designPattern.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: 郭攀博
 * @create: 2018-12-10 07:11
 **/
@Setter
@Getter
public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String context;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getSubject();
        this.context = advTemplate.getContext();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        return (Mail) super.clone();
    }
}
