package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws IOException {

        LineNumberReader reader = new LineNumberReader(new FileReader(""));
        Writer writerRomeo = new FileWriter("");
        Writer writerJulia = new FileWriter("");
        Writer writer = null;

        String s = reader.readLine();

        while (s != null) {

            if (s.startsWith("Romeo:")) {
                writer = writerRomeo;
            }

            if (s.startsWith("Julia:")) {
                writer = writerJulia;
            }

            writer.write(s);
            s = reader.readLine();
        }


    }

//    public static boolean isValid(String login) {
//        Validation validation = new Validation();
//        try {
//            validation.validateLogin(login);
//            return true;
//        } catch (RuntimeException exc) {
//            return false;
//        }
//    }

}