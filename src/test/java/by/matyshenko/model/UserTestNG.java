package by.matyshenko.model;

import org.junit.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class UserTestNG {

    @Test
    public void testGetAllUsers() {
        User user1 = new User("Name1", 45, Sex.FEMALE);
        User user2 = new User("Name2", 35, Sex.MALE);
        User user3 = new User("Name3", 25, Sex.FEMALE);
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetAllUsers1() {
    }

    @Test
    public void testGetAverageAgeOfAllUsers() {
    }
}