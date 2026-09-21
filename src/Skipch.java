import java.util.* ;

class Skipch{
    static void skipch(String p , String up){
        // up means unprocessed string

        if (up.isEmpty()){
            System.out.println(p) ;
            return ;
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            skipch(p , up.substring(1));
        }
        else{
            skipch(p + ch , up.substring(1));
        }
    }

    public static void main(String[] args){
        skipch("" ,"abchdjakka");
    }
}