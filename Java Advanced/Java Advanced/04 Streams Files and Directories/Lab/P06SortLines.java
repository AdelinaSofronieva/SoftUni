package J04StreamsFilesAndDirectories.Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class P06SortLines {
    public static void main(String[] args) throws IOException {

        Path inputPath = Paths.get("src/JavaAdvanced.Resources/input.txt");
        Path outputPath = Paths.get("src/JavaAdvanced.Resources/outputSortLines.txt");

        List<String> lines = Files.readAllLines(inputPath);
        Collections.sort(lines);

        Files.write(outputPath, lines);

    }
}
