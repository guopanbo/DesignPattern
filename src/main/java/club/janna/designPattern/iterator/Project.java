package club.janna.designPattern.iterator;


/**
 * @author: 郭攀博
 * @create: 2019-01-02 07:25
 **/
public class Project implements IProject {

    private String name;
    private int num;
    private int cost;


    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        return String.format("name: %s\tnum: %d\tcost: %d", name, num, cost);
    }
}
