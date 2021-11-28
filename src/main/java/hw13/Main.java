package hw13;

import com.google.gson.Gson;
import hw13.defaults.DefaultUser;
import hw13.entity.User;
import hw13.task.Task;
import hw13.utils.HttpClientUtil;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //task 1.1 "create User"
        User createdDefaultUser = DefaultUser.createDefaultUser();
        System.out.println("user Def" + createdDefaultUser);
        User createUser = new Gson().fromJson(HttpClientUtil.createUser(createdDefaultUser), User.class);
        System.out.println("user created " + createUser);
        System.out.println("--------------");


        //task 1.2 "Update User"
        User updatedUser = new User();
        updatedUser.setName(createUser.getName());
        updatedUser.setUsername("NewUserName");
        updatedUser.setEmail(createUser.getEmail());
        updatedUser.setAddress(createUser.getAddress());
        updatedUser.setWebsite(createUser.getWebsite());
        updatedUser.setCompany(createUser.getCompany());
        updatedUser.setPhone(createUser.getPhone());

        String updateUserSt = HttpClientUtil.updateUser(1, updatedUser);
        User chekUpdateUser = new Gson().fromJson(updateUserSt, User.class);
        System.out.println(chekUpdateUser);

        System.out.println("--------------");

        //task 1.3 "Deleting User"
        createUser.setId(1);
        System.out.println("Status delete "+ HttpClientUtil.deleteUser(createUser));

        //task 1.4 "Get All user
        List<User> allUsers = HttpClientUtil.getAllUsers();
        allUsers.forEach(System.out::println);

        //task 1.5 "Get User for ID"
        System.out.println("User id 1 "+ HttpClientUtil.getUserInfoId(1));

        //task 1.6 "Get user for UserName"
        System.out.println("Get user name " + HttpClientUtil.getUserName("Chelsey Dietrich"));
        //task 2.1
        System.out.println(HttpClientUtil.getAllCommit(createUser));
        //task 3.1
        List<Task> allOpenTasks = HttpClientUtil.getListTaskUser(createUser);
        allOpenTasks.forEach(System.out::println);
    }
}
