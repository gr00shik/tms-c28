package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.dto.SystemPl;

@Data
@AllArgsConstructor
public class Galaxy {
    private String name;
    private SystemPl systemPl;
}
