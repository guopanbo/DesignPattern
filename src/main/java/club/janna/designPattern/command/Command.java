package club.janna.designPattern.command;

/**
 * @author: 郭攀博
 * @create: 2018-12-16 10:07
 **/
public abstract class Command {
    protected Group group;

    public Command(Group group) {
        this.group = group;
    }

    public void execute() {
        this.group.find();
        this.group.add();
        this.group.list();
    };
}
