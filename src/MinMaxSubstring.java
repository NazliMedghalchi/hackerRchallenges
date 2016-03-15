/**
 * Created by nazlimedghalchi on 2016-03-15.
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSubstring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        int min = k;
        int i = 0;

        String minS = str.substring(i,i+k);
        String maxS = str.substring(i,i+k);
        for (i=0; i<=str.length()-k; i++){
            String s1 = str.substring(i,i+k);
            if(s1.compareTo(minS) < 0){
                minS = s1;
            }
            if (s1.compareTo(maxS) > 0){
                maxS = s1;
            }

        }
        System.out.println(minS);
        System.out.println(maxS);
    }
}
