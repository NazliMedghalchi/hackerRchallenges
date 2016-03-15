import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int arr_i = 0;
        for( arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        float rate_pos = 0;
        float rate_neg = 0;
        float rate_zero = 0;
        for (arr_i=0; arr_i<n; arr_i++){
            if (arr[arr_i]>0)
                ++rate_pos;
            if (arr[arr_i] == 0)
                ++rate_zero;
            if (arr[arr_i] < 0)
                ++rate_neg;
        }
        System.out.println(rate_pos/n);
        System.out.println(rate_neg/n);
        System.out.println(rate_zero/n);
    }
}