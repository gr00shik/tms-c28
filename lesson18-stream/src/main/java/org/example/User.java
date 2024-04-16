package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class User {

    private String username;
    private Integer age;
    private Sex sex;
    private boolean onVac;
    private List<Child> childList;

}
