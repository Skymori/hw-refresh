package hw11.task1;

import java.util.Date;

public class OneSecond extends Thread {
    @Override
    public void run(){
        Date date = new Date();
        new Thread(Thread::currentThread);
        while (!Thread.currentThread().isInterrupted()){
            synchronized (this){
                if (!pause()) break;
            }
            System.out.println((new Date().getTime() - date.getTime())/1000);
        }
    }
    private boolean pause(){
        try {
            wait(1000);
        }catch (InterruptedException e){
            return false;
        }notifyAll();
        return true;
    }

}
