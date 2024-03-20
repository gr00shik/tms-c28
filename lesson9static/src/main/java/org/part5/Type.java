package org.part5;

public enum Type {

    A {
        @Override
        public void test() {
            test2();
        }

        public void test2() {

        }

    }
    , B {
        @Override
        public void test() {

        }
    };

    public abstract void test();
}
