package club.janna.designPattern.command;

/**
 * @author: 郭攀博
 * @create: 2018-12-16 10:11
 **/
public class Invoker {
    public void invoke(Command command) {
        command.execute();
    }
}
