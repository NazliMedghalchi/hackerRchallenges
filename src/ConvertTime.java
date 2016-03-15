import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConvertTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        char[] t = time.toCharArray();

        int hh = (Character.getNumericValue(t[0]))*10+Character.getNumericValue(t[1]);
        if (t[8]=='A'){
            if (hh == 12) {
                hh = 0;
            }
        }
        if (t[8]=='P'){
            if (hh <= 12) {
                hh += 12;
            }
        }
        System.out.println(hh + ":"+ t[3]+t[4]+t[5]+t[6]+t[7]);

    }
}