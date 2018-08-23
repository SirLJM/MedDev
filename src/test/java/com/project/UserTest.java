package com.project;

import com.project.entity.User;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    private static User user;
    private static User user2;
    private static User user3;
    private static User user4;

    @BeforeClass
    public static void Initialize() {
        user = new User("John", "Doe");
        user2 = new User("Jack", "Doe");
        user3 = new User("John", "Silver");
        user4 = new User("John", "Doe");
    }

    @Test
    public void shouldCompareTo() {

        System.out.println(user.compareTo(user));
        System.out.println(user2.compareTo(user));
        System.out.println(user3.compareTo(user));
        System.out.println(user4.compareTo(user));

        assertThat(user.compareTo(user4)).isZero();
    }

    @Test
    public void shouldBeEqual() {

        assertThat(user.equals(user4)).isTrue();
    }

    @Test
    public void shouldHaveSameHash() {

        assertThat(user.hashCode() == user4.hashCode()).isTrue();
    }
}
