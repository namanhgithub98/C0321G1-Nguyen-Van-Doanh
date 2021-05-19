package bai11_generic_stack_queue.bai_tap.optional_bai4_palindrome_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String string = in.nextLine();
        Queue queue = new LinkedList();
        Stack stack = new Stack();

        for (int i = 0; i < string.length(); i++) {
            if (i <= string.length() / 2) {
                stack.push(string.charAt(i));
            } else {
                queue.add(string.charAt(i));
            }
        }
        String reversStringQueue = "";
        String reversStringStack = "";

        while (!stack.isEmpty() && !queue.isEmpty()) {
            reversStringStack = reversStringStack + stack.pop();
            reversStringQueue = reversStringQueue + queue.remove();
        }
        System.out.println(reversStringStack);
        System.out.println(reversStringQueue);

        if (reversStringQueue.equals(reversStringStack))
            System.out.println("Chuỗi trên đối xứng.");
        else
            System.out.println("Chuỗi trên không đối xứng.");

    }
}