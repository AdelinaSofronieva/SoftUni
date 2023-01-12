package J04StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class P03CopyBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPath = "src/JavaAdvanced.Resources/input.txt";
        String outputPath = "src/JavaAdvanced.Resources/outputCopyBytes.txt";

        Set<Character> delimiterSet = Set.of(' ', '\n');
        try (InputStream input = new FileInputStream(inputPath);
             OutputStream output = new FileOutputStream(outputPath))
        {
            int oneByte = 0;
            while ((oneByte = input.read()) >= 0) {
                if (oneByte == 10 || oneByte == 32) {
                    output.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++)
                        output.write(digits.charAt(i));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
