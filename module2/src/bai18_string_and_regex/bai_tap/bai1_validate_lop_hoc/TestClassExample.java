package bai18_string_and_regex.bai_tap.bai1_validate_lop_hoc;

public class TestClassExample {
    private static ClassExample classExample;
    public static final String[] str = new String[] { "C0321G", "M0318G" , "C2010G", "P0323A"};

    public static void main(String args[]) {
        classExample = new ClassExample();
        for (String test : str) {
            boolean isvalid = classExample.validate(test);
            System.out.println("Class is " + test +" is valid: "+ isvalid);
        }
    }
}
