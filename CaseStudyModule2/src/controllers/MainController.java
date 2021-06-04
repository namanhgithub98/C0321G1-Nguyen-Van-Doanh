package controllers;

import manager.ManagerCustomer;
import manager.ManagerService;
import modle.House;
import modle.Room;
import modle.Villa;

import java.util.Scanner;

public class MainController {
    //    static ManagerService managerService = new ManagerService();
//    Scanner scanner = new Scanner(System.in);
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit;
    private static String VILLA = "villa";
    private static String HOUSE = "house";
    private static String ROOM = "room";
    private static String CUSTOMER = "customer";
    private static boolean isBackToMenu;

//    public static void main(String[] args) {
//        MainController.displayMainMenu();
//    }

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
                    ManagerCustomer.addNewCustomer();
                    break;
                case 4:
                    ManagerCustomer.showInformationCustomers();
                    break;
                case 5:
//                    Add New Booking
                    break;
                case 6:
//                    Show Information of Employee
                    break;
                case 7:
//                    Exit
                    break;
                default:
                    System.out.println("There is no option");
                    break;
            }
        }
    }
}

