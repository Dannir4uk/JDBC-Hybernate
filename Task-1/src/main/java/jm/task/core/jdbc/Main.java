package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Damir", "Iafizov", (byte) 28);
        userService.saveUser("Alina", "Hichenko", (byte) 21);
        userService.saveUser("Adam", "Immanaliev", (byte) 27);
        userService.saveUser("Yakov", "Rojnov", (byte) 26);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
