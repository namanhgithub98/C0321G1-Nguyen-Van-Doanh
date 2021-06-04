package manager;

import cammon.ExceptionCustomer;
import cammon.FuncWriteRead;
import cammon.VadilateCustomer;
import javafx.scene.transform.Scale;
import modle.Customer;
import modle.Villa;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    static List<Customer> customerList = new ArrayList<>();

    public static void addNewCustomer(){

        Scanner scanner = new Scanner(System.in);

        String name = null;
        do {
            System.out.print("\tNhập tên: ");
            name = scanner.nextLine();
            try {
                VadilateCustomer.validateName(name);
                break;
            } catch (ExceptionCustomer e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String birthday = null;
        do {
            System.out.print("\tMời nhập ngày sinh (dd/mm/YYYY): ");
            birthday = scanner.nextLine();
           try {
               VadilateCustomer.validateBirthday(birthday);
               break;
           } catch (ExceptionCustomer e) {
              System.out.println(e.getMessage);
           }

        } while (true);

        String gender = null;
        do {
            System.out.print("\tMời nhập giới tính: ");
            gender = scanner.nextLine();
            if (VadilateCustomer.validateGender(gender)) {
                System.err.println("Giới tính chỉ chấp nhận Male, Female hoặc Unknown");
                continue;
            }
            break;
        } while (true);

        String idCard = null;
        do {
            System.out.print("\tMời nhập IDcard: ");
            idCard = scanner.nextLine();
            if (VadilateCustomer.validateIdCard(idCard)) {
                System.err.println("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX”.");
                continue;
            }
            break;
        } while (true);

        String phoneNumber = null;
        do {
            System.out.print("\tMời nhập điện thoại: ");
            phoneNumber = scanner.nextLine();
            if (VadilateCustomer.validatePhoneNumber(phoneNumber)) {
                System.err.println("Mời nhập lại điện thoại dạng số.");
                continue;
            }
            break;
        } while (true);

        String email = null;
        do {
            System.out.print("\tMời nhập điện thoại: ");
            email = scanner.nextLine();
            if (VadilateCustomer.validateEmail(email)) {
                System.err.println("Mail sai định dang.");
                continue;
            }
            break;
        } while (true);

        System.out.println("Mời nhập loại khách: ");
        String typeOfCustomer = scanner.nextLine();
        System.out.println("Mời nhập địa chỉ: ");
        String address = scanner.nextLine();
        List<Customer> list = new ArrayList<>();
        Customer customer = new Customer(name, birthday, gender, idCard, phoneNumber, email, typeOfCustomer, address);
        list.add(customer);
        FuncWriteRead.writeCustomerCSV(list);
    }

    public static void showInformationCustomers() {
        List<Customer> list = FuncWriteRead.readCustomerCSV();
        for (Customer customer : list) {
            System.out.println(list.toString());
        }
    }
}
