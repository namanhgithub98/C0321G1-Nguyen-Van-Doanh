package bai13_thuat_toan_tim_kiem.bai_tap.bai1_tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list;
            list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        System.out.println("Chuỗi tăng dần dài nhất là: ");
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
