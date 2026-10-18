package OOPS.Polymorphism;

class OverLoading {
    int a;

    OverLoading() {
        this.a = 10;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;

    }

    static int sum(int a, int b) {
        return a + b;
    }
}