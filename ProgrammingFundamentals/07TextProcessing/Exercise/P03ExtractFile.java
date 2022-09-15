package F10TextProcessing.Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] filePathArr = scanner.nextLine().split("\\\\");

        String[] file = filePathArr[filePathArr.length - 1].split("\\.");
        //File name: Template
        //File extension: pptx

        System.out.printf("File name: %s%n", file[0]);
        System.out.printf("File extension: %s", file[1]);
    }
}
