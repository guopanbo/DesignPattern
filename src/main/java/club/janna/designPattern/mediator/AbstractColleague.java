package club.janna.designPattern.mediator;

/**
 * @author: 郭攀博
 * @create: 2018-12-15 08:19
 **/
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
