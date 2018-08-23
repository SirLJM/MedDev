package com.project;

import com.project.entity.User;
import com.project.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRepositoryTest {

    private UserRepository sut;

    @Before
    public void Initialize() {
        sut = new UserRepository();
    }

    @Test
    public void shouldAddUser() {
        User u = new User("John", "Doe");
        assertThat(sut.getAll()).isEmpty();

        sut.store(u);

        assertThat(sut.getAll()).hasSize(1);
    }

    @Test(expected = NullPointerException.class)
    public void failOnAddNullRecord() {
        sut.store(null);
    }

    @Test
    public void shouldGetAllUsers() {
        User u = new User("John", "Doe");
        User u2 = new User("Jack", "Doe");
        User u3 = new User("John", "Silver");
        sut.store(u);
        sut.store(u2);
        sut.store(u3);

        assertThat(sut.getAll()).contains(u);
        assertThat(sut.getAll()).contains(u2);
        assertThat(sut.getAll()).contains(u3);
    }


}
