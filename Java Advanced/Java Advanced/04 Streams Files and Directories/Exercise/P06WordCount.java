package J04StreamsFilesAndDirectories.Exercise;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06WordCount {
    public static void main(String[] args) throws IOException {

        Path inputPath1 = Paths.get("src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/words.txt");
        Path inputPath2 = Paths.get("src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/text.txt");
        String outputPath = "src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/result.txt";


        Scanner wordScanner = new Scanner(new FileReader(String.valueOf(inputPath1)));

        String[] wordSearch = wordScanner.nextLine().split(" ");

        Map<String, Integer> wordMap = new LinkedHashMap<>();
        for (String word : wordSearch) {
            wordMap.put(word, 0);
        }

        Scanner fileScanner = new Scanner(new FileReader(String.valueOf(inputPath2)));
        String singleWord = fileScanner.next();

        while (fileScanner.hasNext()) {

            if (wordMap.containsKey(singleWord)) {
                int occurences = wordMap.get(singleWord);
                occurences++;
                wordMap.put(singleWord, occurences);

            }

            singleWord = fileScanner.next();
        }

        PrintWriter output = new PrintWriter(new FileWriter(outputPath));

        wordMap.entrySet().forEach(entry -> output.println(entry.getKey() + " - " + entry.getValue()));

        output.close();
    }
}
