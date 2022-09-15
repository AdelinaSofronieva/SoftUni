package F10TextProcessing.MoreExercise;

import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleTittleInput = scanner.nextLine();
        String contentTittleInput = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        result.append(String.format("<h1>%n%s%n</h1>%n", articleTittleInput));
        result.append(String.format("<article>%n%s%n</article>%n", contentTittleInput));

        String currentComment = scanner.nextLine();

        while (!currentComment.equals("end of comments")) {
            result.append(String.format("<div>%n%s%n</div>%n", currentComment));

            currentComment = scanner.nextLine();
        }
        System.out.println(result);
    }
}
