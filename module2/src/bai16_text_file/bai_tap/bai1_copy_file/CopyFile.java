package bai16_text_file.bai_tap.bai1_copy_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(new File("module2\\src\\bai16_text_file\\bai_tap\\bai1_copy_file\\source.txt"));
            outputStream = new FileOutputStream(new File("E:\\C0321G1-Nguyen-Van-Doanh\\module2\\src\\bai16_text_file\\bai_tap\\bai1_copy_file\\target.txt"));

            int length;
            byte[] temp = new byte[1024];

            while ((length = inputStream.read(temp)) > 0) {
                outputStream.write(temp, 0, length);
            }
            System.out.println("File đã được sao chép thành công!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
