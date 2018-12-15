package club.janna.designPattern.mediator;

/**
 * @author: 郭攀博
 * @create: 2018-12-15 08:38
 **/
public class Mediator extends AbstractMediator {
    @Override
    public void offSale() {
        System.out.printf("off sale [%d]\n", super.stock.getStock());
    }

    @Override
    public void buy(int n) {
        if(super.stock.getStock() > 10)
            n /= 2;
        System.out.printf("buy [%d]\n", n);
        super.stock.stock(n);
    }

    @Override
    public void sale(int n) {
        if(super.stock.getStock() < n)
            super.purchase.buy(n - super.stock.getStock());
        System.out.printf("sale [%d]\n", n);
        super.stock.stock(0 - n);
    }
}
