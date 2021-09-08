package hw_4;

public class SpaceShip {
    private String name;
    private String serialNumber;


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() > 8
                || !serialNumber.startsWith("SN")){
            return;
        }
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100){
            return;
        }
         this.name = name;
    }
    public void printInfo(){
        System.out.println("Name is "+ name+" serial number is "+serialNumber);
    }

}
