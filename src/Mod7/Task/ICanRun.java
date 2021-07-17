package Mod7.Task;

public interface ICanRun {
    default void run(){
        System.out.print("I can run ");
    }
}
