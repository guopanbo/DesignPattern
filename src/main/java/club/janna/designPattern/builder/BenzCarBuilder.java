package club.janna.designPattern.builder;

/**
 * @author: 郭攀博
 * @create: 2018-12-04 08:11
 **/
public class BenzCarBuilder extends AbstractCarBuilder {
    @Override
    public CarModel build() {
        CarModel carModel = new BenzCarModel();
        carModel.setSequences(super.sequences);
        return carModel;
    }
}
