import java.util.* ;

class MergeSort{

    static void mergesort(int[] arr , int s , int e){
        if (e - s == 1){
            return ;
        }

        int mid = s + (e - s) / 2 ;

        mergesort(arr , s , mid) ;
        mergesort(arr , mid , e) ;

        merge(arr,s ,e ,mid) ;

    }

    static void merge(int[] arr , int s , int e , int m){
        int[] mix = new int[e -s] ;
        int i = s ;
        int j = m ;
        int k = 0 ;

        while (i < m && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i] ;
                i ++ ;
                k ++ ;

            }
            else{
                mix[k] = arr[j] ;
                j ++ ;
                k ++ ;
            }
        }

        while (i < m){
            mix[k] = arr[i] ;
            i ++ ;
            k ++ ;
        }

        while (j < e){
            mix[k] = arr[j] ;
            j ++ ;
            k ++ ;
        }

        for (int p = 0 ; p < mix.length ; p ++){
            arr[s + p] = mix[p] ;
        }
    }

    public static void main(String[] args){
        int[] arr = {7,6,1,5,9} ;

        mergesort(arr , 0 , arr.length ) ;

        System.out.println(Arrays.toString(arr)) ;
    }
}