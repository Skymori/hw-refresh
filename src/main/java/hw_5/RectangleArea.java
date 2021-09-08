package hw_5;

public class RectangleArea {
    private int x;
    private int y;
    private int x1;
    private int y1;
    public RectangleArea(int[] coords) {
        x = coords[0];
        y = coords[1];
        x1= coords[2];
        y1= coords[3];
    }
    public int getArea(){
        int area = ((x1-x)*(y1-y));
        return Math.abs(area);
    }
}
class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
        System.out.println();
    }
}