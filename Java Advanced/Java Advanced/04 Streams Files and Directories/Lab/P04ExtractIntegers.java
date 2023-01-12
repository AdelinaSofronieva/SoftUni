package J04StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String inputPath = "src/JavaAdvanced.Resources/input.txt";
        String outputPath = "src/JavaAdvanced.Resources/outputExtractIntegers.txt";

        Scanner scanner = new Scanner(new FileInputStream(inputPath));

        PrintWriter output = new PrintWriter(new FileOutputStream(outputPath));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt())
                output.println(scanner.nextInt());

            scanner.next();
        }
        output.close();


    }
}
