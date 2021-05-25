package bai15_exception_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String e) {
        super(e);

    }
   public IllegalTriangleException() {
        super("Cạnh nhỏ hơn 0: ");
   }
}
