package bai11_generic_stack_queue.bai_tap.optional_bai5_to_chuc_du_lieu_hop_ly_queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class DemergingQueue {
    public static void main(String[] args) {
        ArrayList<Personnel> personnels = new ArrayList<Personnel>();
        ArrayList<Personnel> personnels1 = new ArrayList<Personnel>();

        personnels.add(new Personnel("Lương Xuân T", "01/01/1995", "Nam", "1"));
        personnels.add(new Personnel("NguyễN Công P", "30/04/1995", "Nam", "2"));
        personnels.add(new Personnel("Nguyễn Thị Ánh V", "01/09/1996", "Nữ", "3"));
        personnels.add(new Personnel("Nguyễn Tuấn A", "01/05/1995", "Nam", "4"));
        personnels.add(new Personnel("Nguyễn Thị Kim H", "02/09/1983", "Nữ", "5"));

        System.out.println("Danh sách nhập vào ban đầu: " + personnels);
        Collections.sort(personnels);
        for (Personnel personnel : personnels) {
            System.out.println(personnel.toString());
        }
        Queue<Personnel> NU = new ArrayDeque<>();
        Queue<Personnel> NAM = new ArrayDeque<>();
        for (Personnel personnel : personnels) {
            if (personnel.getGender().equals("NỮ")) {
                NU.add(personnel);
            } else {
                NAM.add(personnel);
            }
        }
        while (!NAM.isEmpty()) {
            personnels1.add(NAM.poll());
        }
        while (!NU.isEmpty()) {
            personnels1.add(NU.poll());
        }
        System.out.println("Danh sách");
        for (Personnel personnel : personnels1) {
            System.out.println(personnels.toString());
        }
    }
}
