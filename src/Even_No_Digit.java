import java.util.*;

public class Even_No_Digit {

    static int findno(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        if (digits(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Find no's which contain even no of digits");
        int nums[] = {12, 23, 22334, 11, 3, 45};
        System.out.println("The answer is: " + findno(nums));

    }
}
