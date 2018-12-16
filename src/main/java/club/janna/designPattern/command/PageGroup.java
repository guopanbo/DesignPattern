package club.janna.designPattern.command;

/**
 * @author: 郭攀博
 * @create: 2018-12-16 10:03
 **/
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("find page group");
    }

    @Override
    public void add() {
        System.out.println("add a  page");
    }

    @Override
    public void delete() {
        System.out.println("delete a page");
    }

    @Override
    public void list() {
        System.out.println("page list");
    }
}
