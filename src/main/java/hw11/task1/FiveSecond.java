package hw11.task1;

public class FiveSecond implements Runnable{
    @Override
    public void run() {
        new Thread(Thread::currentThread);
        while (!Thread.currentThread().isInterrupted()){
            synchronized (this){
                if (!pause()) break;
                System.out.println("   5 second");
            }
        }
    }
    private boolean pause(){
        try {
            wait(5000);
        }catch (InterruptedException e){
            return false;
        }
        notifyAll();
        return true;
    }

}
