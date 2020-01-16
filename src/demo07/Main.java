package demo07;

class A {
    public int getSum(int a, int b) {
        return a + b;
    }
}

class B extends A {

    public int getSum(int a, int b) {
        return super.getSum(a, b);
    }
}

public class Main {
    public static void main (String[] args) {
        B b = new B();
    }
}
