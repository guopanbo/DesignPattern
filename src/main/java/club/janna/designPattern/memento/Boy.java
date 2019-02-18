package club.janna.designPattern.memento;

/**
 * @author: 郭攀博
 * @create: 2019-02-18 08:19
 **/
public class Boy implements Cloneable {

    private String state = "happy";

    private Boy backup;

    public void changeState() {
        this.state = "sad";
    }

    public void createMemento() {
        try {
            this.backup = this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void restoreMemento() {
        this.state = this.backup.state;
    }

    public String getState() {
        return state;
    }

    @Override
    protected Boy clone() throws CloneNotSupportedException {
        return (Boy) super.clone();
    }
}
