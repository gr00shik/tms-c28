package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class User implements Cloneable {

    @ToString.Exclude
    private String nickname;
    private String secondname;
    private int age;
    @EqualsAndHashCode.Exclude
    private boolean isMan;

}
