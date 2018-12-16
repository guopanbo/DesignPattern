package club.janna.designPattern.command;

/**
 * @author: 郭攀博
 * @create: 2018-12-16 10:09
 **/
public class AddPageCommand extends Command {
    public AddPageCommand() {
        super(new PageGroup());
    }
}
