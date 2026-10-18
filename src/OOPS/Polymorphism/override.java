package OOPS.Polymorphism;

class override {
    public static void main(String args[]) {
        OverLoading obj1 = new OverLoading();
//        System.out.println(obj1.sum(1, 2, 3));
//        System.out.println(obj1.sum( 1 , 3));
        child c1 = new child();
       System.out.println( c1.multiply(3 ,4 ) );
    }
}