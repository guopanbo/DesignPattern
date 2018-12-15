package club.janna.designPattern.mediator;

import lombok.Getter;

/**
 * @author: 郭攀博
 * @create: 2018-12-15 08:23
 **/
public class Stock extends AbstractColleague {
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    @Getter
    private int stock = 0;

    public void stock(int n) {
        this.stock += n;
    }

    public void offSale() {
        super.mediator.offSale();
    }
}
