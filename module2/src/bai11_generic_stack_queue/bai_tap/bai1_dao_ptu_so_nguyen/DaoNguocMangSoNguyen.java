package bai11_generic_stack_queue.bai_tap.bai1_dao_ptu_so_nguyen;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguocMangSoNguyen {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = array.length;

        for (int i = 0; i < size; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack);
        int[] reverseArray = new int[size];
        for (int i = 0; i < size; i++) {
            reverseArray[i] = stack.pop();
        }
        System.out.println("Mảng sao khi đảo: " + Arrays.toString(reverseArray));


    }
}
