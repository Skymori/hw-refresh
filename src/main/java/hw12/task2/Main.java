package hw12.task2;

import hw12.task2.setting.MyRunnable;
import hw12.task2.setting.MyThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        MyThreadPoolExecutor myThreadPoolExecutor = new MyThreadPoolExecutor(10);
        myThreadPoolExecutor.execute(new MyRunnable());
        myThreadPoolExecutor.shutdown();
    }
}
