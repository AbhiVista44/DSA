public class OrderAgnosticBS {

    static int BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isASC = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isASC == true) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // int arr[]={12,23,45,76,89};
        int arr[] = {90, 78, 45, 23, 1};
        System.out.println(BS(arr, 23));
    }

}
