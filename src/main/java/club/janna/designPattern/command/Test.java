package club.janna.designPattern.command;

/**
 * @author: 郭攀博
 * @create: 2018-12-16 10:12
 **/
public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.invoke(new AddPageCommand());

        invoker.invoke(new AddRequirementCommand());
    }
}
