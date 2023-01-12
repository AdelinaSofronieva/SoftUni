package J04StreamsFilesAndDirectories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class P07MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path inputPath1 = Paths.get("src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/inputOne.txt");
        Path inputPath2 = Paths.get("src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/inputTwo.txt");
        String outputPath = "src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/output.txt";


        Path firstFile = Paths.get(String.valueOf(inputPath1));
        List<String> firstFileLines = Files.readAllLines(firstFile);

        Path secondFile = Paths.get(String.valueOf(inputPath2));
        List<String> secondFileLines = Files.readAllLines(secondFile);

        Path output = Paths.get(outputPath);
        Files.write(output, firstFileLines, StandardOpenOption.APPEND);
        Files.write(output, secondFileLines, StandardOpenOption.APPEND);


    }
}
