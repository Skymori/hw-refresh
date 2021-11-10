package hw11.task2.setting;

public class Terminated {
    public static boolean terminatedThread(Thread... threads){
        boolean terminated = true;
        for (Thread thread:threads){
            terminated = terminated && thread.getState() == Thread.State.TERMINATED;
        }
        return terminated;
    }
}
