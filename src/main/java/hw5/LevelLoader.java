package hw5;

public class LevelLoader {
    private LevelLoader() {
    }

    public static LevelLoader getInstance(){
        return instance;
    }
    private static LevelLoader instance = new LevelLoader();


    String load(String levelName){
        return "Loading level " + levelName+ " ...";
    }
}
