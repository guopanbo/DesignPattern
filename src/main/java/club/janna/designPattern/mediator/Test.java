package club.janna.designPattern.mediator;

/**
 * @author: 郭攀博
 * @create: 2018-12-15 08:43
 **/
public class Test {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Sale sale = new Sale(mediator);
        Purchase purchase = new Purchase(mediator);
        Stock stock = new Stock(mediator);
        mediator.setPurchase(purchase);
        mediator.setSale(sale);
        mediator.setStock(stock);

        purchase.buy(6);
        sale.sale(7);

        purchase.buy(20);

        stock.offSale();
    }
}
