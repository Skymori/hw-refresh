package hw13.defaults;

import hw13.entity.User;

public class DefaultUser {
    public static User createDefaultUser(){
        User user = new User();
        user.setId(1);
        user.setName("Name");
        user.setUsername("UserName");
        user.setEmail("email@email.com");
        user.setAddress(DefaultAddress.createDefaultAddress());
        user.setPhone("12312");
        user.setWebsite("webCom.com");
        user.setCompany(DefaultCompany.createDefaultCompany());
        return user;
    }
}
