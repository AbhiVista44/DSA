import java.util.*;

class DJ {

    static void cyclicsort(int[] arr) {
        int i = 0;

        while (i < arr.length) {

            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static ArrayList<Integer> missingno(int arr[]){
        ArrayList<Integer> list = new ArrayList<>(arr.length);

        for (int  i = 0 ; i < arr.length ; i ++){
            if (arr[i] != i){
                list.add(i);
            }
        }
        return list ;
    }

    static ArrayList<Integer> duplicateno(int[] arr){
        ArrayList<Integer> list = new ArrayList<>(arr.length);

        for (int  i = 0 ; i < arr.length ; i ++){
            if (arr[i] != i){
                list.add(arr[i]);
            }
        }
        return list ;
    }

    public static void main(String args[]) {
        int[] arr = {
                4,3,2,7,8,2,3,1,0
        };

        cyclicsort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("The duplicateno is: " + duplicateno(arr));
        System.out.println("The missing no is: " + missingno(arr)) ;
    }
}