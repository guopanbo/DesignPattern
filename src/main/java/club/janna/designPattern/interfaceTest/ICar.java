package club.janna.designPattern.interfaceTest;

public interface ICar {
    default void run() {
        System.out.println("ICar run");
    }
    default void stop() {
        System.out.println("ICar stop");
    }
}
