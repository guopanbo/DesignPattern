package club.janna.designPattern.mediator;

/**
 * @author: 郭攀博
 * @create: 2018-12-15 08:28
 **/
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buy(int n) {
        super.mediator.buy(n);
    }
}
