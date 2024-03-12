package org.part2;

public class Out2Class {

    private static String name = "HELLO";

    public void outTest() {
        System.out.println("out test");
        In2Test in2Test = new In2Test();
        in2Test.inTest();

        in2Test.prInTest();
    }

    private static void outStaticTest() {
    }

    public static class In2Test {

        public void inTest() {
            System.out.println("in test" + name);
            outStaticTest();
            Out2Class out2Class = new Out2Class();
            out2Class.outTest();
        }

        private void prInTest() {

        }

    }

}
