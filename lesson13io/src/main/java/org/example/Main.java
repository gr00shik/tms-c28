package org.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
//        String text = "Hello my friend!!!";
//        byte[] bytes = text.getBytes();

//        try(OutputStream os = new FileOutputStream("/Users/sergey/write.txt")) {
//            os.write(bytes);
//        } catch (IOException exc) {
//            System.out.println("can not write");
//        }

//        try(InputStream is = new FileInputStream("/Users/sergey/write.txt")) {
//            byte[] bytes = is.readAllBytes();
//            String str = new String(bytes);
//            System.out.println(str);
//        } catch (IOException exc) {
//            System.out.println("Error while reading");
//        }


        try (InputStream is = new BufferedInputStream(new FileInputStream("/Users/sergey/app.dmg"));
             OutputStream os = new BufferedOutputStream(new FileOutputStream("/Users/sergey/app_copy.dmg"))) {

            int read = is.read();

            while (read != -1) {
                os.write(read);
                read = is.read();
            }

        } catch (IOException exc) {
            System.out.println("can not copy");
        }

//        System.out.println("Hello");
//        Scanner scanner = new Scanner(System.in);

//        File file = new File("/Users/sergey/");
//        try {
//            file.
//        } catch (IOException exc) {
//            System.out.println("Can not create file");
//        }
    }
}