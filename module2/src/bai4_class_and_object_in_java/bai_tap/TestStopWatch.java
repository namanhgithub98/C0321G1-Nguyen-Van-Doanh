package bai4_class_and_object_in_java.bai_tap;

public class TestStopWatch {
    public static int[] selectionSort(int... a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.StarTime();
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        selectionSort(arr);
        stopWatch.EndTime();
        System.out.println("Time: " + stopWatch.getElapsedTime());
    }
}
