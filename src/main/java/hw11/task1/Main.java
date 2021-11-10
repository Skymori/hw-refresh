package hw11.task1;

public class Main {
    public static void main(String[] args) {
        Thread oneSec = new Thread(new OneSecond());
        Thread fiveSec = new Thread(new FiveSecond());
        oneSec.start();
        fiveSec.start();
        try {
            Thread.sleep(60000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        oneSec.interrupt();
        fiveSec.interrupt();
    }
}
