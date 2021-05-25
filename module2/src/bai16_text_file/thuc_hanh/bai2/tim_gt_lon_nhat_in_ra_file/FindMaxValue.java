package bai16_text_file.thuc_hanh.bai2.tim_gt_lon_nhat_in_ra_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("module2\\src\\bai16_text_file\\thuc_hanh\\bai2\\tim_gt_lon_nhat_in_ra_file\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("module2\\src\\bai16_text_file\\thuc_hanh\\bai2\\tim_gt_lon_nhat_in_ra_file\\numbers.txt", maxValue);
//        System.out.println(maxValue);
    }

}
