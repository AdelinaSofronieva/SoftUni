package F08ObjectsAndClasses.Exercise.P02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //{title}, {content}, {author}".
        String[] inputText = scanner.nextLine().split(", ");
        String title = inputText[0];
        String content = inputText[1];
        String author = inputText[2];

        Articles currentArticle = new Articles(title, content, author);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numOfCommands; i++) {
            String[] commandLine = scanner.nextLine().split(": ");
            String currentCommand = commandLine[0];
            String currentValue = commandLine[1];

            switch (currentCommand) {
                case "Edit":
                    currentArticle.setContent(currentValue);
                    break;
                case "ChangeAuthor":
                    currentArticle.setAuthor(currentValue);
                    break;
                case "Rename":
                    currentArticle.setTittle(currentValue);
                    break;
            }

        }


        System.out.println(currentArticle);

    }
}
