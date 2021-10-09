package hw3;

import java.util.Scanner;

public class SaveStarShip {
    public int calculateDistance(int distance){
        if (distance > 0){
            return distance;
        }else {
           return distance * (-1);
        }
    }
//    public class SaveStarShip {
//        public int calculateDistance(int distance) {
//            if (distance < 0) {
//                return distance * -1;
//            }
//
//            return distance;
//        }
public String[] getPlanets(String galaxy){
        if (galaxy.equals("Miaru")){
            return new  String[] {"Maux", "Reux", "Piax"};
        }else if (galaxy.equals("Milkyway")){
            return new String[] {"Earth", "Mars", "Jupiter"};
        }else if (galaxy.equals("DangerBanger")){
            return new String[]{"Fobius", "Demius"};
        }else
            return new String[0];
}
//    public String[] getPlanets(String galaxy){
//        if (galaxy == "Miaru"){
//            return new  String[] {"Maux", "Reux", "Piax"};
//        }else if (galaxy == "Milkyway"){
//            return new String[] {"Earth", "Mars", "Jupiter"};
//        }else if (galaxy =="DangerBanger" ){
//            return new String[]{"Fobius", "Demius"};
//        }else {
//            return new String[]{};
//        }
//}
    public String choosePlanet(long distanceToEarth){
        if (distanceToEarth < 45677){
            return "Earth";
        }else
            return "Pern";
    }
    public int calculateFuelPrice(String fuel, int count){
        if (fuel.equals("STAR100")){
            return count * 70;
        }else if (fuel.equals("STAR500")){
            return count * 120;
        }else if (fuel.equals("STAR1000")){
            return count * 200;
        }else
            return count * 50;
    }
//    public int calculateFuelPrice(String fuel, int count) {
//        int price = 50;
//
//        if (fuel.equals("STAR100")) {
//            price = 70;
//        } else if (fuel.equals("STAR500")) {
//            price = 120;
//        } else if (fuel.equals("STAR1000")) {
//            price = 200;
//        }
//
//        return count * price;
//    }
    public int roundSpeed(int speed){
        if (speed % 10 <= 5){
            return (speed / 10) * 10;
        }else
            return (speed /10) *10 + 10;
    }
//    public int roundSpeed(int speed) {
//        int firstDigit = speed / 10;
//        int lastDigit = speed % 10;
//
//        if (lastDigit >= 5) {
//            firstDigit++;
//        }
//
//        return firstDigit * 10;
//    }
    public int calculateNeededFuel(int distance){
        int fuel = 0;
        if (distance<= 20){
            fuel = 1000;
        }else if (distance>20){
            fuel = ((distance - 20) * 5)+ 1000;
        }return fuel;
    }
    public void calculateMaxPower(){
        Scanner scanner = new Scanner(System.in);
        float first = scanner.nextFloat();
        float second = scanner.nextFloat();
        float there = scanner.nextFloat();
        scanner.close();

        float max = first > second ? first : second;
        max = max > there ? max : there;

        if (max < 10f){
            System.out.println(max *= 0.7f);
        }else if (max<100f){
            System.out.println(max*= 1.2f);
        }else
            System.out.println(max *= 2.1f);
    }
    public String getMyPrizes(int ticket){
        String prizes = "";
        if (ticket % 10 == 0){
            prizes += " crystall";
        }if (ticket % 10 == 7){
            prizes+= " chip";
        }if (ticket > 200){
            prizes+= " coin ";
        }
        return prizes.strip();
    }
    public boolean isHangarOk(int side1, int side2, int price){

        return ((side1*side2)>=1500 &&
                ((float)side1/side2<=2.0 && (float)side2/side1<=2.0) &&
                price/(side1*side2)<=1000);

    }
    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
}