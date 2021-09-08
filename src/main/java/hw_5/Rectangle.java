package hw_5;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public boolean canPlaceInto(Rectangle anotherRect){
        if (this.a <= anotherRect.a && this.b <= anotherRect.b || this.b <= anotherRect.a && this.a <= anotherRect.b)
        {   return true;
        }     else return false;
    }
}