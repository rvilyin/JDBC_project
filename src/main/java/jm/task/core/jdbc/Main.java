package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Sasha", "Ivanov", (byte)20);
        userService.saveUser("Pavel", "Sidorov", (byte)16);
        userService.saveUser("Masha", "Agafonova", (byte)25);
        userService.saveUser("Roman", "Andreev", (byte)15);
        List<User> users = userService.getAllUsers();
        System.out.println(users);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
