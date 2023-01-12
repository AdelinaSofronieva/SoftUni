package J04StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class P02WriteToFile {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        String inputPath = "src/JavaAdvanced.Resources/input.txt";
        String outputPath = "src/JavaAdvanced.Resources/output.txt";

        Set<Character> punctuationSet = Set.of(',', '.', '!', '?');

        try (InputStream input = new FileInputStream(inputPath);
            OutputStream output = new FileOutputStream(outputPath))
        {
            int oneByte = 0;
            while ((oneByte = input.read()) >= 0) {
                            if (!punctuationSet.contains((char)oneByte)) {
                output.write(oneByte);
            }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
