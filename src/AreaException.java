/**
 * Created by nazlimedghalchi on 2016-03-12.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AreaException {

    //Write your code here
    static Scanner sc = new Scanner (System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;

    static {
        try {
            if (B> 0 && H>0){

                flag = true;
            }
            else{
                flag = false;
                System.out.println( "java.lang.Exception: Breadth and height must be positive");
            }


        }catch (Exception e){
            System.out.println( e);
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }//end of main

}//end of class

