class String_ispalindrome{
    static boolean ispalindrome(String str){
        if (str == null || str.length() == 0){
            return false;
        }
        int start = 0 ;
        int end = str.length() -1 ;
        while (start <= end){
            if (str.charAt(start) != str.charAt(end)){
                return false ;
            }
            start ++ ;
            end -- ;
        }
        return true ;
    }
    public static void main(String args[]){
        String str = "abcdcbah";
        System.out.println(ispalindrome(str));
    }
}