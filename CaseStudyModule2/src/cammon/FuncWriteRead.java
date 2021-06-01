package cammon;

import modle.Customer;
import modle.House;
import modle.Room;
import modle.Villa;

import javax.crypto.Cipher;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteRead {

    //Đọc (Villa, House, customer, employee)
    // ghi
    List<Customer> readFileToList() {
        List<Customer> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = null;
            while ((object = objectInputStream.readObject())!= null) {
                Customer customer = (Customer) object;
                list.add(customer);
            }
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lỗi File");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
    void writeListProductToFile(List<Customer> list) {
        list.addAll(readFileToList());
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Customer customer:list) {
                objectOutputStream.writeObject(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lỗi File");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        }
    }
    // Đọc FileVilla
    public static void writeVillaCSV(List<Villa> villaList) {
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter("src\\data\\villa.csv",true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Villa villa: villaList) {
                bufferedWriter.write(villa.getId()+","+villa.getTenDichVu()+","+villa.getDienTichSD()+","+villa.getChiPhiThue()+","+villa.getSoNguoiTD()+","+villa.getKieuThue()+","+villa.getTieuChuanPhong()+","+villa.getTienNghiKhac()+","+villa.getSHoBoi()+","+villa.getSoTang());

            }
            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi FileVilla
    public static List<Villa> readVillaCSV() {
        List<Villa> villaList = new ArrayList<>();
        FileReader fileReader =null;
        BufferedReader bufferedReader =null;
        try {
            fileReader = new FileReader("src\\data\\villa.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line =null;
            String[] arr =null;
            Villa villa = null;
                    while ((line=bufferedReader.readLine())!=null){
                        arr = line.split(",");
                        villa = new Villa(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],arr[9]);
                        villaList.add(villa);
                    }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    // Đọc FileHouse
    public static void writeHouseCSV(List<House> houseList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\house.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (House house : houseList) {
                bufferedWriter.write(house.getId() + "," + house.getTenDichVu() + "," + house.getDienTichSD() + "," + house.getChiPhiThue() + ","
                        + house.getSoNguoiTD() + "," + house.getKieuThue() + "," + house.getTieuChuanPhong() + "," + house.getTienNghiKhac() + ","
                        + house.getSoTang());

            }
            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi FileHouse
    public static List<House> readHoueseCSV() {
        List<House> houseList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\house.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            House house = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                house = new House(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                houseList.add(house);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    // Đọc FileRoom
    public static void writeRoomCSV(List<Room> roomList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\room.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Room room : roomList) {
                bufferedWriter.write(room.getId() + "," + room.getTenDichVu() + "," + room.getDienTichSD() + ","
                        + room.getChiPhiThue() + "," + room.getSoNguoiTD() + "," + room.getKieuThue() +"," + room.getDvMienPhi());

            }
            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Ghi FileRoom
    public static List<Room> readRoomCSV() {
        List<Room> roomList = new ArrayList<>();
        FileReader fileReader =null;
        BufferedReader bufferedReader =null;
        try {
            fileReader = new FileReader("src\\data\\room.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line =null;
            String[] arr =null;
            Villa villa = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Room room = new Room(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
                roomList.add(room);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

}
