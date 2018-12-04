package club.janna.designPattern.builder;

/**
 * @author: 郭攀博
 * @create: 2018-12-04 08:18
 **/
public class BMWCarBuilder extends AbstractCarBuilder {
    @Override
    public CarModel build() {
        CarModel carModel = new BMWCarModel();
        carModel.setSequences(super.sequences);
        return carModel;
    }
}
