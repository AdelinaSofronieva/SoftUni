package J04StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P02SumBytes {
    public static void main(String[] args) {

        String inputPath = "src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/input.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));) {

            String line = in.readLine();

            long sum = 0;
            while (line != null) {

                for (char c : line.toCharArray()) {
                    sum += c;
                }

                line = in.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
