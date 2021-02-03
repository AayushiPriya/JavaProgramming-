import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 public  static String binaryConverter(int n)
 {
     String s1 = "";
     while(n!=0) {
         int q = n / 2;
         int rem =  n%2;
         s1 = rem + s1;
         n=q;
     }
//     String rev="" ;
//     for(int i=s1.length()-1;i>=0;i--) {
//         rev=rev+s1.charAt(i);
//     }
//     return rev;

     return s1; 
 }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       System.out.print(binaryConverter(n));
        scanner.close();
    }
}
