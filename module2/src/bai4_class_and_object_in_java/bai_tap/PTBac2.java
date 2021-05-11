package bai4_class_and_object_in_java.bai_tap;

public class PTBac2 {
    private double a;
    private double b;
    private double c;

    public PTBac2() {
    }

    public PTBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double denTa(){
        double denTa = b*b-4*a*c;
        return denTa;
    }
    public double nghiem1(){
        double x1 =( -b+Math.sqrt(denTa()))/(2*a);
        return x1;
    }
    public double nghiem2(){
        double x2 =( -b-Math.sqrt(denTa()))/(2*a);
        return x2;
    }
    public double nghiemKep(){
        double x =( -b/(2*a));
        return x;
    }
    public void giaiPT(){
        if (denTa()>0){
            System.out.println("Phương trình có 2 nghiêm x1 = "+nghiem1()+" x2 = "+ nghiem2());
        }else if (denTa()==0){
            System.out.println("Pt có nghiệm kép x = "+ nghiemKep());
        }else {
            System.out.println("pt vô nghiêm");
        }
    }
}
