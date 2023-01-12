package J04StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class P01SumLines {
    public static void main(String[] args) {

        String inputPath = "src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/input.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));) {

            String line = in.readLine();

            while (line != null) {

                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }

                System.out.println(sum);
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
