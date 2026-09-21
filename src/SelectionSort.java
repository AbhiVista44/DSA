import java.util.*;
public class SelectionSort {
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int maxIndex,int last){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
    }

    static int getMaxIndex(int[] arr,int start,int last){
        int max=start;
        for(int i=0;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void main(String args[]){
        int[] arr={12,56,4,2,-23,45,-9,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
