package com.project.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@EqualsAndHashCode
@NoArgsConstructor
public class User implements Comparable<User> {

    @Getter
    private String firstName;
    @Getter
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public int compareTo(User o) {
        final int EQUAL = 0;

        if (this == o) return EQUAL;

        int comparison = this.firstName.compareTo(o.firstName);
        if (comparison != EQUAL) return comparison;

        comparison = this.lastName.compareTo(o.lastName);
        if (comparison != EQUAL) return comparison;

        return EQUAL;
    }
}
