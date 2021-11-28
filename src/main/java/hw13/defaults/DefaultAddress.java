package hw13.defaults;

import hw13.entity.Address;

public class DefaultAddress {
    public static Address createDefaultAddress(){
        Address address = new Address();
        address.setStreet("St");
        address.setSuit("Suit apt");
        address.setCity("City");
        address.setZipcode("123123");
        address.setGeo(DefaultGeo.createDefaultGeo());
        return address;
    }
}
