package hw12.task2.setting;
@Repeat(count = 3)
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello!");
    }
}
