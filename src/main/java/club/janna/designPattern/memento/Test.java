package club.janna.designPattern.memento;

/**
 * @author: 郭攀博
 * @create: 2019-02-18 08:24
 **/
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.createMemento();
        System.out.println("初始状态 - " + boy.getState());
        boy.changeState();
        System.out.println("现在状态 - " + boy.getState());
        boy.restoreMemento();
        System.out.println("恢复状态 - " + boy.getState());
    }
}
