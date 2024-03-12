package org.part1.ext;

import java.io.Serializable;

public class ABImpl implements A, B, Serializable {

    @Override
    public void doA() {
        String text = A.getText();
    }

    @Override
    public void doB() {

    }
}
