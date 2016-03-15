import java.io.*;
import java.util.*;

public class UpperLowerCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        //
        //int size1 =  (int) chA(0);
        //Char chB = B.toCharArray();
        //int size2 =  (int) chB(0);


        System.out.println(sum);
        if(A.compareTo(B) < 0){
            System.out.println("No");
            // Char[] chA = A.toCharArray();
            String upA = A.substring(0,1).toUpperCase()+A.substring(1);
            String upB = B.substring(0,1).toUpperCase() + B.substring(1);
            System.out.println(upA + " " + upB);
        }
        else if (A.compareTo(B) > 0) {
            System.out.println("Yes");
            //Char[] chB = B.toCharArray();
            String upB = B.substring(0,1).toUpperCase() + B.substring(1);
            System.out.println(upB + " " + A);
        }


    }
}

