import java.util.*;
public class BubbleSort {
    static void BS(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean Swapped=false;
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    Swapped=true;
                }
            }
            if(Swapped=false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={23,3,451,1,4,0,-1,98};
        BS(arr);
        System.out.println(Arrays.toString(arr));
    }

}
