package demo03;

class A {
    private int x;
    public int y;

    public int getX() {
        return x;
    }

    private void go() {
    }
}

class B extends A {
    public void foo() {
    }
}

public class Main {
    public static void main (String[] args) {
        B b = new B();
    }
}
