package hw2;

public class ScoreCounter {
    public int addScore(int currentScore, int amount){
       return currentScore += amount;
    }
    public int twiceScore(int currentScore){
       return currentScore *=2;
    }
    public static void main(String[] args) {
        ScoreCounter counter = new ScoreCounter();
        System.out.println("addScore(10, 5) = " + counter.addScore(10, 5));
    }
}
