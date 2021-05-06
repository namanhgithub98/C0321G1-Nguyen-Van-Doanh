package bai2_loop.bai_tap;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num = 100;
        int N = 2;
        Boolean check =  true;
        for (int i = 2; i <= num; i++) {
            check = true;
            for (int j = 2; j <= Math.sqrt(N); j++) {
                if (N % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
            }
            N++;
        }

    }
}
