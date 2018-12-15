package club.janna.designPattern.mediator;

/**
 * @author: 郭攀博
 * @create: 2018-12-15 08:18
 **/
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sale(int n) {
        super.mediator.sale(n);
    }

    public void offSale() {
        super.mediator.offSale();
    }
}
