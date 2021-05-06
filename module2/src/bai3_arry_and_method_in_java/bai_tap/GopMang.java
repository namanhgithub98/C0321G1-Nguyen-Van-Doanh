package bai3_arry_and_method_in_java.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {10, 4, 6, 7, 8, 0, 9};
        int[] arr2 = {1,2,3,4,5,6,7};
        int[] arr3  = new int[arr1.length+arr2.length];

        for(int i =0 ; i <arr3.length;i++){
            if (i<arr1.length){
                arr3[i]=arr1[i];
            }
            if (i>=arr1.length){
                arr3[i]=arr2[i-arr1.length];
            }
        }
        for (int i =0;i<arr3.length;i++){
            System.out.print(arr3[i]+ "\t");
        }
    }
}
