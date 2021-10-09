package hw5;

public class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets){
        double minDistance = Math.hypot(targets[0][0]-aiCoords[0], targets[0][1]-aiCoords[1]);
        int count = 0;
        for (int i = 0; i < targets.length; i++) {
            double distance = Math.hypot(targets[i][0]-aiCoords[0], targets[i][1]-aiCoords[1]);
            if (distance < minDistance){
                minDistance = distance;
                count = i;
            }
        }
        return new int[] {targets[count][0], targets[count][1]};
    }
}
