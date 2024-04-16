package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.Planet;

@Data
@AllArgsConstructor
public class SystemPl {
    private String name;
    private Planet planet;
}
