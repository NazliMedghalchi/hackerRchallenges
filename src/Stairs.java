/**
 * Created by nazlimedghalchi on 15-12-20.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
* output should be:
*      #
*     ##
*    ###
*   ####
*  #####
* ######
* */
public class Stairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=1; i<=n; i++) {
            int cnt = 1;
            int padding = n-i; // for blank space before #
            while (cnt<= padding) {
                System.out.print(" ");
                cnt++;
            }
            while (cnt > padding && cnt <=n){
                System.out.print("#");
                cnt++;
            }
            System.out.println();
        }
    }
}

/*
 static void StairCase(int n) {

for(int i=0; i<n; i++){
        int count = 1;
        int padding = n-i;
        while(count<padding){
        System.out.print(" ");
        count++;
        }
        while (count>=padding && count<=n){
        System.out.print("#");
        count++;
        }
        System.out.println();
        }

        }
// */

