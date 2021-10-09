package hw2;

public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent){
        return holeDepth < 34 || batteryPercent > 67;
    }
    public boolean canJumpOverHill(int hillHeight, int batteryPercent){
        return hillHeight <= 150 && batteryPercent > 90;
    }
    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding){
        return isEngineWorking != isRobotStanding;
    }
    public boolean shouldSleep(boolean isDayNow){
        return !isDayNow;
    }
  //Test output
    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();

        //Should be false
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
    }
}
