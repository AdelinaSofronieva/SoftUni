package F08ObjectsAndClasses.Exercise.P04Articles2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Articles> articlesList = new ArrayList<>();

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numOfCommands; i++) {
            String[] commandLine = scanner.nextLine().split(", ");
            String tittle = commandLine[0];
            String content = commandLine[1];
            String author = commandLine[2];

            Articles currentArticle = new Articles(tittle, content, author);
            articlesList.add(currentArticle);
        }

        for (Articles article: articlesList) {
            System.out.println(article);
        }
        //System.out.println(articlesList);
    }
}
