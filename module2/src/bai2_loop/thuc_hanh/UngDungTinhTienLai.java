package bai2_loop.thuc_hanh;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class UngDungTinhTienLai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRrate = 1.0;

        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of month: ");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interestRrate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRrate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
