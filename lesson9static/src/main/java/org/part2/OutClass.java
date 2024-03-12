package org.part2;

public class OutClass {

    private InClass inClass;

    public void outTest() {
        System.out.println("out_test");

        inClass = new InClass();
        inClass.inTest();

    }

    public InClass getInClass() {
        return inClass;
    }

    private class InClass {

        public void inTest() {
            System.out.println("in_test");
            outTest();
        }

    }

}
