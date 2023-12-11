package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        String name1 = "Sasha";
        String surname1 = "Ivanov";
        byte age1 = 20;
        String name2 = "Pavel";
        String surname2 = "Sidorov";
        byte age2 = 16;
        String name3 = "Masha";
        String surname3 = "Agafonova";
        byte age3 = 25;
        String name4 = "Roman";
        String surname4 = "Andreev";
        byte age4 = 15;
        userService.saveUser(name1, surname1, age1);
        userService.saveUser(name2, surname2, age2);
        userService.saveUser(name3, surname3, age3);
        userService.saveUser(name4, surname4, age4);
        List<User> users = userService.getAllUsers();
        System.out.println(users);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
