package by.matyshenko.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    private User user1;
    private User user2;
    private User user3;

    @Before
    public void setUp() throws Exception {
        user1 = new User("Petr", 25, Sex.MALE);
        user2 = new User("Rafa", 15, Sex.MALE);
        user3 = new User("Kata1", 35, Sex.FEMALE);
    }

    @Test
    public void getAllUsers() {

        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();

        actual.add(user1);
        actual.add(user2);
        actual.add(user3);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_MALE() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAllUsers_MALE_NO_NULL() {
        List<User> expected = User.getAllUsers(Sex.MALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_FEMALE_NO_NULL() {
        List<User> expexted = User.getAllUsers(Sex.FEMALE);
        Assert.assertNotNull(expexted);
    }

    @Test
    public void getHowManyUsers() {
        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getHowManyUsers1() {
        int ecpected = User.getHowManyUsers(Sex.MALE);
        int actual = 2;

        Assert.assertEquals(ecpected, actual);
    }

    @Test
    public void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();

        int actual = 25 + 15 + 35;
      ;
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void getAllAgeUsers1() {
    }

    @Test
    public void getAverageAgeOfAllUsers() {

        int expected = User.getAverageAgeOfAllUsers();

        int actual = (25 + 15 + 35) / 3;

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void getAverageAgeOfAllUsers1() {
    }
}