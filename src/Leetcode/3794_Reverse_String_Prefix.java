package Leetcode;

class Reverse_String_Prefix {
    public static void main(String args[]){
        String a = "abcd" ;
        System.out.println(prefix_reverse(a , 2)) ;
    }

    static StringBuilder prefix_reverse(String a , int k){
        StringBuilder sb = new StringBuilder() ;

        // Just starting reverse from k-1 and adding to sb stringbuilder
        for (int i = k - 1 ; i >=0 ; i --){
            sb.append(a.charAt(i)) ;
        }

        //  remaining characters adding as it is from k
        for (int j = k ; j < a.length() ; j ++){
            sb.append(a.charAt(j)) ;
        }
        return sb ;
    }

}