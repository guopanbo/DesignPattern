package club.janna.designPattern.builder;

/**
 * @author: 郭攀博
 * @create: 2018-12-04 08:20
 **/
public class Director {
    private AbstractCarBuilder benzCarBuilder = new BenzCarBuilder();
    private AbstractCarBuilder bmwCarBuilder = new BMWCarBuilder();

    public CarModel getBenzA() {
        return benzCarBuilder.init()
                .next(1)
                .next(3)
                .next(4)
                .end()
                .build();
    }

    public CarModel getBenzB() {
        return benzCarBuilder.init()
                .next(1)
                .next(2)
                .next(3)
                .next(4)
                .end()
                .build();
    }

    public CarModel getBMWA() {
        return bmwCarBuilder.init()
                .next(1)
                .next(3)
                .next(4)
                .end()
                .build();
    }

    public CarModel getBMWB() {
        return bmwCarBuilder.init()
                .next(1)
                .next(3)
                .next(2)
                .next(4)
                .end()
                .build();
    }
}
