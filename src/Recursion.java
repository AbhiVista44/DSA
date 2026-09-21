import java.util.*;

class Star {

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void Fibo(int n) {
        int a = 0;
        int b = 1;
        int[] arr = new int[n];

        int i = 0;
        while (i < n) {
            arr[i] = a;
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }

        System.out.println("The no at " + n + " th of fibo is : " + arr[n - 1]);
    }

    static int RecursiveFibo(int n) {
        if (n < 2) {
            return n;
        }

        int ans = RecursiveFibo(n - 1) + RecursiveFibo(n - 2);

        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // pattern1(sc.nextInt());

        // System.out.println();

        // pattern2(sc.nextInt());

        // System.out.println() ;

        // pattern3(sc.nextInt()) ;

        // Fibo(10);

        // int n = sc.nextInt() ;

        // System.out.println(RecursiveFibo(n)) ;
    }
}