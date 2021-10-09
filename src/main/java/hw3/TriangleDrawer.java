package hw3;

public class TriangleDrawer {
    public String drawTriangle(int side){
        while (side>0){
            System.out.println("*".repeat(side));
            side--;
        }
        return "";
    }
}
