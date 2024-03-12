package org.part3;

public class Main {

    public static void main(String[] args) {

        String text = "hello alex";
        SendMessageService service = new SendMessageService();

        Sender email = new Sender() {
            @Override
            public void sendMessage(String message) {
                System.out.println("send " + message);
            }

            @Override
            public void fixCharacters(String message) {

            }
        };

        MathInt mathInt = new MathInt() {
            @Override
            public int sum(int v1, int v2) {
                return v1 + v2;
            }

            @Override
            public int mul(int v1, int v2) {
                return v1 * v2;
            }
        };

        System.out.println(mathInt.sum(30, 45));

        service.send(text, email);



    }

}
