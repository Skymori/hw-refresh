package hw_2;

public class ProfShop {
    public boolean isPriceOk(int price){
        return price != 1000;
    }
    public float calculateRegularDiscountPrice(float price){
        return  price * 0.9f;
    }
    public boolean isDiscount50(int price){
        return price * 4 == 1000;
    }
    public boolean isPriceHappy(int price, int year, int day){
        return price == year * day;
    }
}
