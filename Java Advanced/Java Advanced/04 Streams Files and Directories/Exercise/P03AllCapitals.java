package J04StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class P03AllCapitals {
    public static void main(String[] args) {
        String inputPath = "src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/input.txt";
        String outputPath = "src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/output.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {

            String line = in.readLine();
            int counter = 1;

            while (line != null) {

                out.println(line.toUpperCase());

                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
