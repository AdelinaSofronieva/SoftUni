package J04StreamsFilesAndDirectories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/inputLineNumbers.txt");
        Path outputPath = Paths.get("src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/output.txt");

        List<String> lines = Files.readAllLines(inputPath);
        int count = 1;

        for (int i = 0; i < lines.size(); i++) {

            String currentLine = count + ". " + lines.get(i);
            lines.set(i, currentLine);

            count++;
        }

        Files.write(outputPath, lines);


    }
}
