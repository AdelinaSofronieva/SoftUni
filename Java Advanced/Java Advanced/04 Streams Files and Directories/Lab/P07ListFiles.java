package J04StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.util.Scanner;

public class P07ListFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File("src/JavaAdvanced.Resources/Files-and-Streams");

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n",
                                f.getName(), f.length());
                    }
                }
            }
        }

    }
}
