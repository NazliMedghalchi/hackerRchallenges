/**
 * Created by nazlimedghalchi on 2016-02-24.
 */
import java.util.Scanner;
public class OutputFormatiing {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("================================");
    for(int i=0;i<3;i++)
    {
        String s1=sc.next();
        int x=sc.nextInt();
        System.out.printf("%-15s%03d\n", s1, x);
    }
    System.out.println("================================");

    }
}

