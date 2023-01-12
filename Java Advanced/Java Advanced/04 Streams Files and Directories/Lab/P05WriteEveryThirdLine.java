package J04StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPath = "src/JavaAdvanced.Resources/input.txt";
        String outputPath = "src/JavaAdvanced.Resources/outputDivisibleBy3.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {

            String line = in.readLine();
            int counter = 1;

            while (line != null) {

                if (counter % 3 == 0) {
                    out.println(line);
                }

                counter++;
                line = in.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
