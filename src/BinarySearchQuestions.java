import java.util.*;

class Turbo {

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < (arr.length - 1 )  &&  arr[mid] > arr[mid + 1]) {
                return mid;
            }

            else if (mid > start && arr[mid] < arr[mid - 1]) {
                return (mid - 1);
            }

            else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int pivotinduplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < (arr.length - 1 )  &&  arr[mid] > arr[mid + 1]) {
                return mid;
            }

            else if (mid > start && arr[mid] < arr[mid - 1]) {
                return (mid - 1);
            }

            else if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start --;
                if (arr[end - 1] > arr[end]){
                    return end - 1 ;
                }
                end --;
            }

            else if (arr[mid] > arr[start] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1 ;
            }

            else {
                end = mid - 1 ;
            }
        }
        return -1;
    }



    static int search(int[] arr , int target){
        int p = pivotinduplicate(arr);



        if (p == -1){
            return bs(arr,target,0,arr.length - 1);
        }

        else if (target == arr[p]){
            return p;
        }

        else if (target >= arr[0]){
            return bs(arr, target , 0 , p - 1);
        }
        else {
            return bs(arr , target , p + 1 , arr.length - 1);
        }
    }

    static int bs(int[] arr, int target , int start , int end){


        while (start <= end){
            int mid = start + (end - start) / 2 ;

            if (target == arr[mid]){
                return mid;
            }

            else if (target > arr[mid]){
                start = mid + 1 ;
            }
            else{
                end = mid - 1 ;
            }

        }
        return -1 ;
    }

    static int findKRotation(int arr[]) {
        int start = 0 ;
        int end = arr.length - 1 ;

        while (start <= end){
            int mid = start + (end - start) / 2 ;

            if (arr[mid] > arr[mid + 1]){
                return mid + 1 ;
            }
            else if (arr[mid] < arr[mid - 1]){
                return mid;
            }
            else if (arr[start] >= arr[mid]){
                end = mid - 1 ;
            }
            else{
                start = mid + 1 ;
            }
        }
        return 0;

    }

    public static void main(String args[]){
        int[] arr = {5,6,7,8,9,10,13,0,1,2,3,4};
        int ans = search(arr,4);
        System.out.println(ans);
        System.out.println(findKRotation(arr));
    }
}