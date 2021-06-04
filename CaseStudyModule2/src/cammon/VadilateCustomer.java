package cammon;

import java.util.regex.Pattern;

public class VadilateCustomer {

    public static void validateName(String name) throws ExceptionCustomer {
        String regex = "^\\p{Lu}\\p{Ll}*(\\s\\p{Lu}\\p{Ll}*)*$";
        if (!Pattern.matches(regex, name)) {
            throw new ExceptionCustomer("Tên chưa đúng định dạng");
        }
    }

    public static boolean validateBirthday(String str) throws ExceptionCustomer {
        String regex = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
        if (!Pattern.matches(regex, str)) {
            throw new ExceptionCustomer("Sai định dạng theo dd/mm/yyyy");
        } else return ;
    }


    public static boolean validateGender(String str) {
        return str.equals("Male") || str.equals("Female") || str.equals("Unknown");
    }


    public static boolean validateIdCard(String str) {
        String regex = "^[0-9]{3} [0-9]{3} [0-9]{3}$";
        return Pattern.matches(regex, str);
    }

    public static boolean validatePhoneNumber(String str) {
        String regex = "^0[0-9]{9}$";
        return Pattern.matches(regex,str);
    }

    public static boolean validateEmail(String email) {
        String regex = "^\\w+@[a-zA-Z]+\\.[a-zA-Z]+$";
        return Pattern.matches(regex, email);
    }
}
