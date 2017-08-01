package lesson20;

import java.io.*;

public class InputOutput {

    public static void main(String[] args) throws IOException {
        String firstFileName = "/Users/admin/IdeaProjects/hillelJava/src/lesson20/FirstFile";
        String secondFileName = "/Users/admin/IdeaProjects/hillelJava/src/lesson20/SecondFile";
        InputStream inputStream = new BufferedInputStream(new FileInputStream(firstFileName));
        OutputStream outputStream = new FileOutputStream(secondFileName);
        int data = inputStream.read();
        outputStream.write(data);
        long start = System.currentTimeMillis();
        while (data != -1) {

            data = inputStream.read();
            outputStream.write(data);
            System.out.println(data);
        }
        System.out.println(System.currentTimeMillis() - start + " milliseconds time");
        inputStream.close();
        outputStream.close();
    }
}