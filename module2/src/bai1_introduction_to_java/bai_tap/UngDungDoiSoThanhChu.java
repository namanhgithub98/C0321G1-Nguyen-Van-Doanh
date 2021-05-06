package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDoiSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        Integer num = sc.nextInt();
        System.out.println("The number: " + num);
        String num1 = "";
        String num2 = "";
        String num3 = "";
        if (num <= 10 && num > 0) {
            switch (num) {
                case 1:
                    num1 = "one";
                    break;
                case 2:
                    num1 = "two";
                    break;
                case 3:
                    num1 = "three";
                    break;
                case 4:
                    num1 = "four";
                    break;
                case 5:
                    num1 = "five";
                    break;
                case 6:
                    num1 = "six";
                    break;
                case 7:
                    num1 = "seven";
                    break;
                case 8:
                    num1 = "eight";
                    break;
                case 9:
                    num1 = "nine";
                    break;
                case 10:
                    num1 = "ten";
                    break;

            }
            System.out.println(num1);
        }
        if (num > 10 && num < 20) {
            switch (num) {
                case 11:
                    num1 = "eleven";
                    break;
                case 12:
                    num1 = "twelve";
                    break;
                case 13:
                    num1 = "thirteen";
                    break;
                case 14:
                    num1 = "fourteen";
                    break;
                case 15:
                    num1 = "fifteen";
                    break;
                case 16:
                    num1 = "sixteen";
                    break;
                case 17:
                    num1 = "seventeen";
                    break;
                case 18:
                    num1 = "eighteen";
                    break;
                case 19:
                    num1 = "nineteen";
                    break;

            }
            System.out.println(num1);

        }
        if (num > 21 && num <= 99) {
            switch (num / 10) {
                case 2:
                    num1 = "twenty";
                    break;
                case 3:
                    num1 = "thirty";
                    break;
                case 4:
                    num1 = "fourty";
                    break;
                case 5:
                    num1 = "fifty";
                    break;
                case 6:
                    num1 = "sixty";
                    break;
                case 7:
                    num1 = "seventy";
                    break;
                case 8:
                    num1 = "eightty";
                    break;
                case 9:
                    num1 = "ninety";
                    break;
            }
            switch (num % 10) {
                case 1:
                    num2 = "one";
                    break;
                case 2:
                    num2 = "two";
                    break;
                case 3:
                    num2 = "three";
                    break;
                case 4:
                    num2 = "four";
                    break;
                case 5:
                    num2 = "five";
                    break;
                case 6:
                    num2 = "six";
                    break;
                case 7:
                    num2 = "seven";
                    break;
                case 8:
                    num2 = "eight";
                    break;
                case 9:
                    num2 = "nine";
                    break;
            }
            System.out.println(num1 + " " + num2);
        }
        if (num > 99 && num <= 999) {
            switch (num / 100) {
                case 1:
                    num1 = "one hundred";
                    break;
                case 2:
                    num1 = "two hundred";
                    break;
                case 3:
                    num1 = "three hundred";
                    break;
                case 4:
                    num1 = "four hundred";
                    break;
                case 5:
                    num1 = "five hundred";
                    break;
                case 6:
                    num1 = "six hundred";
                    break;
                case 7:
                    num1 = "seven hundred";
                    break;
                case 8:
                    num1 = "eight hundred";
                    break;
                case 9:
                    num1 = "nine hundred";
                    break;
            }
            if (num % 100 > 20) {
                switch (num % 100 / 10) {
                    case 2:
                        num2 = "twenty";
                        break;
                    case 3:
                        num2 = "thirty";
                        break;
                    case 4:
                        num2 = "fourty";
                        break;
                    case 5:
                        num2 = "fifty";
                        break;
                    case 6:
                        num2 = "sixty";
                        break;
                    case 7:
                        num2 = "seventy";
                        break;
                    case 8:
                        num2 = "eightty";
                        break;
                    case 9:
                        num2 = "ninety";
                        break;
                }
                switch (num % 100 % 10) {
                    case 1:
                        num3 = "one";
                        break;
                    case 2:
                        num3 = "two";
                        break;
                    case 3:
                        num3 = "three";
                        break;
                    case 4:
                        num3 = "four";
                        break;
                    case 5:
                        num3 = "five";
                        break;
                    case 6:
                        num3 = "six";
                        break;
                    case 7:
                        num3 = "seven";
                        break;
                    case 8:
                        num3 = "eight";
                        break;
                    case 9:
                        num3 = "nine";
                        break;
                }
                System.out.println(num1 + " and " + num2 + " " + num3);
            } else {
                switch (num % 100) {
                    case 10:
                        num2 = "ten";
                        break;
                    case 11:
                        num2 = "eleven";
                        break;
                    case 12:
                        num2 = "twelve";
                        break;
                    case 13:
                        num2 = "thirteen";
                        break;
                    case 14:
                        num2 = "fourteen";
                        break;
                    case 15:
                        num2 = "fifteen";
                        break;
                    case 16:
                        num2 = "sixteen";
                        break;
                    case 17:
                        num2 = "seventeen";
                        break;
                    case 18:
                        num2 = "eighteen";
                        break;
                    case 19:
                        num2 = "nineteen";
                        break;
                }
                System.out.println(num1 + " and " + num2 + "" + num1);
            }
        }
    }
}
