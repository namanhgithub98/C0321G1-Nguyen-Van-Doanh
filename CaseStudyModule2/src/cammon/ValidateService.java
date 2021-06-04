package cammon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateService {


    //Mã dịch vụ
    public static boolean validateId(String id, String typeService) {
        String regexString;
        switch (typeService) {
            case "villa":
                regexString = "^(SVVL)-[0-9]{4}$";
                break;
            case "house":
                regexString = "^(SVHO)-[0-9]{4}$";
                break;
            case "room":
                regexString = "^(SVRO)-[0-9]{4}$";
                break;
            default:
                return false;
        }
        return Pattern.matches(regexString, id);
    }

    // Tên dịch vụ
    public static boolean validateServiceName(String str) {
        String regexString = "^[A-Z][a-z]*[0-9]*$";
        return Pattern.matches(regexString, str);
    }

    //Diện tích sử dụng
    public static boolean validateArea(String str) {
        String regexString = "^[1-9][0-9]*$";
        if (Pattern.matches(regexString, str)) {
            boolean check = 30 < Integer.parseInt(str);
            return check;
        }
        return false;
    }

    // Chi phí thuê
    public static boolean validatePrice(String str) {
        String regexString = "^[1-9][0-9]*$";
        return Pattern.matches(regexString, str);
    }

    // Diện tích hồ bơi
    public static boolean validateSwimmingPool(String str) {

        String regexString = "^[1-9][0-9]*$";
        if (Pattern.matches(regexString, str)) {
            boolean check = 30 < Integer.parseInt(str);
            return check;
        }
        return false;
    }

    // Số người tối đa
    public static boolean validateMaxPeople(String str) {
        String regexString = "^[1-9][0-9]*$";
        if (Pattern.matches(regexString, str)) {
            boolean check = 0 < Integer.parseInt(str) &&  Integer.parseInt(str) < 20;
            return check;
        }
        return false;
    }

    // Kiểu thuê
    public static boolean validateRentleType(String str) {
        String regexString = "^[A-Z][a-z]*[0-9]*$";
        return Pattern.matches(regexString, str);
    }
    //Tiêu chuẩn Phòng
    public static boolean validateRoomStandard(String str) {
        String regexString = "^[A-Z][a-z]*[0-9]*$";
        return Pattern.matches(regexString, str);
    }


    // Số tầng
    public static boolean validateFloors(String str) {
    String regexString = "^[1-9]*";
    return Pattern.matches(regexString,  str);
    }
}
