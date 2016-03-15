/**
 * Created by nazlimedghalchi on 2016-03-12.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class EndOfFileTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(sc.hasNext()){
            String s = sc.nextLine();
            if (s != null){
                count ++;
                System.out.println(count +" "+ s);
            }
            //  else
            //       System.out.println("Reched EOF!");
        }

    }
}

