package hw5;

public class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    public int getDistance(){
       double distance = Math.hypot(endX-startX, endY-startY);
        return (int) Math.round(distance);
    }
}
