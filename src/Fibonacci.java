//import java.util.*;
//public class Fibonacci {
//    public static void main(String args[]){
//        Scanner sc =new Scanner(System.in);
//        int a=0;
//        int b=1;
//        System.out.println("Enter the no: ");
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            System.out.println(a);
//            int temp=b;
//            b=a+b;
//            a=temp;
//
//        }
//        int num=1212321221;
//        int count=0;
//        while(num>0){
//            int rem=num%10;
//            if(rem==2){
//                count ++;
//            }
//            num=num/10;
//        }
//        System.out.println("Occurence of no 2 is: "+count);
//
//        int rev=12345;
//        int ans=0;
//        while(rev>0){
//            int rem=rev%10;
//            ans=ans*10+rem;
//            rev=rev/10;
//
//        }
//        System.out.println("Reverse no is: "+ans);
//    }
//}
///*// Online Java Compiler
//// Use this editor to write, compile and run your Java code online
//import java.util.*;
//class Main {
//
//       static void swap(int[] r,int index1,int  index2){
//           int temp=r[index1];
//           r[index1]=r[index2];
//           r[index2]=temp;
//       }
//
//       static int max(int[] r){
//           int maximum=r[0];
//           for(int i=0;i<r.length;i++){
//               if(maximum<r[i]){
//                   maximum=r[i];
//               }
//           }
//           return maximum;
//       }
//
//       static void reverse(int r[]){
//           int index1=0;
//           int index2=r.length-1;
//         while(index1<index2){
//             swap(r,index1,index2);
//             index1++;
//             index2--;
//         }
//       }
//    public static void main(String[] args) {
//        int[] r={12,23,8,4,14,15};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Multidimensional Arraylist");
//        ArrayList<ArrayList<Integer>> s=new ArrayList<>();
//
//        for(int i=0;i<3;i++){
//            s.add(new ArrayList<>());
//        }
//
//        System.out.println("Enter the elements of each arraylist: ");
//
//        for(int i=0;i<3;i++){
//            s.get(i).add(sc.nextInt());
//        }
//
//       System.out.print(s);
//
//       System.out.println("Swapping of array");
//      swap(r,1,2);
//       System.out.println("New Array: "+ Arrays.toString(r));
//
//       System.out.println(max(r));
//
//       System.out.println("Reverse of array: ");
//       reverse(r);
//       System.out.println(Arrays.toString(r));
//    }
//}/*
//// Online Java Compiler
//// Use this editor to write, compile and run your Java code online
//import java.util.*;
//class Main {
//
//    static boolean str(String s,char target){
////
////        for(int i=0;i<s.length();i++){
////            if(s.length()==0){
////                return false;
////            }
//
//            if(target == s.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        System.out.println("Linear Search Algo");
//        String h="Abhi";
//        System.out.println("Result: "+str(h,'l'));
//    }
