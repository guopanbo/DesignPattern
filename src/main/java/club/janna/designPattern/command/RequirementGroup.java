package club.janna.designPattern.command;

/**
 * @author: 郭攀博
 * @create: 2018-12-16 10:06
 **/
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("find requirement group");
    }

    @Override
    public void add() {
        System.out.println("add a requirement");
    }

    @Override
    public void delete() {
        System.out.println("delete a requirement");
    }

    @Override
    public void list() {
        System.out.println("requirement list");
    }
}
