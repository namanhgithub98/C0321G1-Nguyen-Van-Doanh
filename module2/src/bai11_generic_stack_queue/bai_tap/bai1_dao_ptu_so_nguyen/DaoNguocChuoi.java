package bai11_generic_stack_queue.bai_tap.bai1_dao_ptu_so_nguyen;

import java.sql.SQLOutput;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        String string = "Có Một Không Hai";
        String[] stringArr = string.split(" ");
        System.out.println(" Chuỗi ban đầu: " + string);

        Stack<String > stringReverse = new Stack<>();
        for (String i : stringArr) {
            stringReverse.push(i);
        }
        string = "";
        while (!stringReverse.isEmpty()) {
            string += stringReverse.pop() + " ";
        }
        System.out.println("Chuỗi đã đảo: " + string);
    }
}
