package org.example;

import java.util.Scanner;

public class F2EmptyReturnImpl implements F2EmptyReturn {
    @Override
    public String test() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
