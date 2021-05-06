package bai2_loop.thuc_hanh;

import java.util.Scanner;

public class KiemTtraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 2)
            System.out.println(number +  "is NOT a prime");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number +  "is a prime");
            else
                System.out.println(number +  "is a NOT prime");

        }
    }
}
