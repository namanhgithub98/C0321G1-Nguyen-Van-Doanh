package manager;

import cammon.FuncWriteRead;
import modle.House;
import modle.Room;
import modle.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    Scanner scanner = new Scanner(System.in);
    static List<Villa> villaList = new ArrayList<>();
    //thêm (Room, House, Vilaa)
    //sửa   (Room, House, Vilaa)
    //xóa    (Room, House, Vilaa)
    //hiển thị   (Room, House, Vilaa)
    public static void addNewServies() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addVilla();
                    count++;
                    break;
                case 2:
//                    ManagerHouse.addHouse();
                    count++;
                    break;
                case 3:
//                    ManagerRoom.addRoom();
                    count++;
                    break;
                case 4:
                    break;
                case 5:
                    count++;
                    break;
                default:
                    count++;
                    System.out.println("There is no option");
                    break;
            }
        }
    }
    public static void addVilla () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập dien tích sử dụng: ");
        String dienTichSD = scanner.nextLine();
        System.out.println("Nhập chi phí thuê: ");
        String chiPhiThue = scanner.nextLine();
        System.out.println("Nhập số người tối đa: ");
        String soNguoiTD = scanner.nextLine();
        System.out.println("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập tiện nghi khác: ");
        String tienNghiKhac = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        String dienTichHoBoi = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        String soTang = scanner.nextLine();
        System.out.println("ok");
        Villa villa = new Villa(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue, tieuChuanPhong, tienNghiKhac,
                dienTichHoBoi, soTang);
        List<Villa> list = new  ArrayList();
        list.add(villa);
        FuncWriteRead.writeVillaCSV(list);
    }
    public void addHouse () {
//            String tieuChuanPhong = scanner.nextLine();
//            String tienNghiKhac = scanner.nextLine();
//            String soTang = scanner.nextLine();
//            House house = new House(tieuChuanPhong, tienNghiKhac, soTang);
    }
    public void addRoom () {
//            String DvMienPhi = scanner.nextLine();
//            Room room = new Room(DvMienPhi);
    }



    public static void showServices() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tShow New Villa\n" +
                    "2.\tShow New House\n" +
                    "3.\tShow New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    showVilla();
                    count++;
                    break;
                case 2:
//                    ManagerHouse.addHouse();
                    count++;
                    break;
                case 3:
//                    ManagerRoom.addRoom();
                    count++;
                    break;
                case 4:
                    break;
                case 5:
                    count++;
                    break;
                default:
                    count++;
                    System.out.println("There is no option");
                    break;
            }
        }
    }
    private static void showVilla() {
        List<Villa> list = FuncWriteRead.readVillaCSV();
        for (Villa villa: list) {
            System.out.println(villa.toString());
        }
    }


}
