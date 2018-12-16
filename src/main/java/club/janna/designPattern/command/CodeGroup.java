package club.janna.designPattern.command;

/**
 * @author: 郭攀博
 * @create: 2018-12-16 10:04
 **/
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("find code group");
    }

    @Override
    public void add() {
        System.out.println("add a code");
    }

    @Override
    public void delete() {
        System.out.println("delete a code");
    }

    @Override
    public void list() {
        System.out.println("code list");
    }
}
