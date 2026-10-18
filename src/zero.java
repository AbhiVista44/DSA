import java.util.*;

class zero {
    static int count = 0;

    static int countzero(int n) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            count++;
        }

        return countzero(n / 10);

    }

    public static void main(String args[]) {
        System.out.println(countzero(1032052020));
    }
}