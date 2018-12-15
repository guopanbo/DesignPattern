package club.janna.designPattern.mediator;

import lombok.Setter;

/**
 * @author: 郭攀博
 * @create: 2018-12-15 08:19
 **/
@Setter
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public abstract void offSale();
    public abstract void buy(int n);
    public abstract void sale(int n);
}
