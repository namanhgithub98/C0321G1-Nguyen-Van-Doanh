package bai11_generic_stack_queue.bai_tap.bai2_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào một số thập phân: ");
        int num = in.nextInt();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num = num / 2;
        }
        System.out.println("Giá trị nhị phân là: ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop() + "\t");
        }
    }
}
