package J04StreamsFilesAndDirectories.Exercise;

import java.io.*;
import java.util.*;

public class P04CountCharacterTypes {
    public static void main(String[] args) {

        String inputPath = "src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/input.txt";
        String outputPath = "src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/output.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {

            String line = in.readLine();
            int counter = 1;

            Set<Character> vowelsSet = new HashSet<>();
            Collections.addAll(vowelsSet,'a', 'e', 'i', 'o', 'u');

            Set<Character> punctuationMarksSet = new HashSet<>();
            Collections.addAll(punctuationMarksSet,'!', ',', '.', '?');

            Set<Character> consonantsSet = new HashSet<>();

            int vowelsCount = 0;
            int consonantsCount = 0;
            int punctuationMarksCount = 0;

            while (line != null) {

                for (char c : line.toCharArray()) {
                    if (vowelsSet.contains(c)) {
                        vowelsCount++;
                    } else if (punctuationMarksSet.contains(c)) {
                        punctuationMarksCount++;
                    } else if (!Character.isWhitespace(c)){
                            consonantsCount++;
                    }
                }

                line = in.readLine();
            }

            out.println("Vowels: " + vowelsCount);
            out.println("Consonants: " + consonantsCount);
            out.println("Punctuation: " + punctuationMarksCount);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
