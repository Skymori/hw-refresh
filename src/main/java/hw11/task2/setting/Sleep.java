package hw11.task2.setting;

public class Sleep {
    public static void sleep(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
