package bai1_introduction_to_java.thuc_hanh;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
         System.out.println("Enter a: ");
         a = sc.nextInt();
         System.out.println("Enter b: ");
         b = sc.nextInt();

         a = Math.abs(a);
         b = Math.abs(b);

         if (a == 0 || b == 0) {
             System.out.println("No greatest common factor");

             while (a != b) {
                 if (a > b)
                     a = a - b;
                 else
                     b = b - a;
             }
         }
        System.out.println("Greatest common factor: " + a );
    }
}
