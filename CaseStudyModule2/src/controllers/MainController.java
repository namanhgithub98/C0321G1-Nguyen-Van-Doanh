package controllers;

import manager.ManagerService;
import modle.House;
import modle.Room;
import modle.Villa;

import java.util.Scanner;

public class MainController {
//    static ManagerService managerService = new ManagerService();
//    Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice : " +
                    "1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            Scanner scanner = new Scanner(System.in);
            int chooseService = Integer.parseInt(scanner.nextLine());
            switch (chooseService) {
                case 1:
                ManagerService.addNewServies();
                    break;
                case 2:
                ManagerService.showServices();
                    break;
                case 3:
//                addNewCustomer();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("There is no option");
                    break;
            }
        }
    }
}
//    public void addNewServies() {
//        Scanner input = new Scanner(System.in);
//        int count =0;
//        while (count<1) {
//            System.out.println("Please enter your choice :" +
//                    "1.\tAdd New Villa\n" +
//                    "2.\tAdd New House\n" +
//                    "3.\tAdd New Room\n" +
//                    "4.\tBack to menu\n" +
//                    "5.\tExit\n");
//            int choose = Integer.parseInt(scanner.nextLine());
//            switch (choose) {
//                case 1:
//                    managerService.addVilla();
//                    break;
//                case 2:
//                    managerService.addHouse();
//                    break;
//                case 3:
//                    managerService.addRoom();
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    count++;
//                    break;
//                default:
//                    count++;
//                    System.out.println("There is no option");
//                    break;
//            }
//        }
//    }

