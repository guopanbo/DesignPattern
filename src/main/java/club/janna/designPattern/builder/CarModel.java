package club.janna.designPattern.builder;

import java.util.List;

/**
 * @author: 郭攀博
 * @create: 2018-12-04 07:09
 **/
public abstract class CarModel {
    protected abstract void start();
    protected abstract void engineBoom();
    protected abstract void whistle();
    protected abstract void stop();

    private List<Integer> sequences;

    public void run() {
        if(this.sequences != null && !this.sequences.isEmpty())
            sequences.forEach(seq -> {
                switch(seq) {
                    case 1:
                        this.start();
                        break;
                    case 2:
                        this.engineBoom();
                        break;
                    case 3:
                        this.whistle();
                        break;
                    case 4:
                        this.stop();
                        break;
                }
            });
    }

    public final void setSequences(List<Integer> sequences) {
        this.sequences = sequences;
    }
}
