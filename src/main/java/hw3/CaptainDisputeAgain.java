package hw3;

public class CaptainDisputeAgain {
    public int findMin(int[] triple){
        int min = triple[0] < triple[1] ? triple[0] : triple[1];
        min = min < triple[2] ? min : triple[2];
        return min;
    }
}
