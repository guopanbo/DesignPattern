package club.janna.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 郭攀博
 * @create: 2018-12-04 08:03
 **/
public abstract class AbstractCarBuilder {

    List<Integer> sequences = new ArrayList<>();

    public abstract CarModel build();

    public Seq init() {
        sequences.clear();
        return new Seq(this);
    }

    public class Seq {

        AbstractCarBuilder builder;

        private Seq(AbstractCarBuilder builder) {
            this.builder = builder;
        }

        public Seq next(int seq) {
            this.builder.sequences.add(seq);
            return this;
        }

        public AbstractCarBuilder end() {
            return this.builder;
        }
    }
}
