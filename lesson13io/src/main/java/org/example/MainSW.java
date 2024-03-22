package org.example;

import java.io.FileReader;
import java.io.LineNumberReader;

public class MainSW {

    public static void main(String[] args) {

        try(LineNumberReader reader =
                    new LineNumberReader(new FileReader("/Users/sergey/write.txt"))) {

            String s = reader.readLine();


            while (s != null) {
                System.out.println(s);
                s = reader.readLine();
            }


        } catch (Exception exc) {

        }


    }

}
