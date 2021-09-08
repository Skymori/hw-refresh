package hw_4;

public class Tanker {
    private String serialNumber;

    protected String getFuelType(){
        return "A500";
    }
    public void refuel(int amount){
        System.out.println("Add "+ amount +" of "+ getFuelType()+", tanker serial number is "+ getSerialNumber());
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
