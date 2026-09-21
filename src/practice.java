import java.util.*;

class Practice {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Print "Nvidia" 5 times
        int j = 5;
        for (int i = 1; i <= j; i++) {
            System.out.println("Nvidia");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find maximum of three numbers
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum is: " + max);

        // Fibonacci series
        int n = 10;
        int first = 0, second = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }

        // Reverse a number
        int k = 123312533;
        int ans = 0;
        while (k > 0) {
            int rem = k % 10;
            k = k / 10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reverse number is: " + ans);

        // Count occurrences of digit 3
        int num = 123312533;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 3) count++;
            num = num / 10;
        }
        System.out.println("Occurrences of digit 3: " + count);

        sc.close();
    }
}
