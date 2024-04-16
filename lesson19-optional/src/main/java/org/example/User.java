package org.example;

import lombok.Data;

import java.util.Optional;

@Data
public class User {
    private Optional<String> name;
    private Optional<Integer> age;
}
