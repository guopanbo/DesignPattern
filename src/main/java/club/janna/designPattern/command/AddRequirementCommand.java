package club.janna.designPattern.command;

/**
 * @author: 郭攀博
 * @create: 2018-12-16 10:11
 **/
public class AddRequirementCommand extends Command {
    public AddRequirementCommand() {
        super(new RequirementGroup());
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("Ha ha");
    }
}
