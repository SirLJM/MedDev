package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User> {

    @Getter
    private String firstName;
    @Getter
    private String lastName;


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
