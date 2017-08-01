package lesson20;

import java.io.*;

public class InputOutput {

    public static void main(String[] args) throws IOException {
        String firstFileName = "/Users/admin/IdeaProjects/hillelJava/src/lesson20/FirstFile";
        String secondFileName = "/Users/admin/IdeaProjects/hillelJava/src/lesson20/SecondFile";
        InputStream inputStream = new BufferedInputStream(new FileInputStream(firstFileName));
        OutputStream outputStream = new FileOutputStream(secondFileName);
        long start = System.currentTimeMillis();
        int data;
        do {
            data = inputStream.read();
            if (data != -1) {
                outputStream.write(data);
            }
            System.out.println(data);
        } while (data != -1);
        inputStream.close();
        outputStream.close();
        System.out.println(System.currentTimeMillis() - start + " milliseconds time");
    }
}