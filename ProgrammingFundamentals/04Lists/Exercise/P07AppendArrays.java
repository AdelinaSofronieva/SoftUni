package F05Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> commandLines = Arrays.stream(scanner.nextLine()
                .split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(commandLines);
        String text = "";

        for (int i = 0; i < commandLines.size(); i++) {
            text += commandLines.get(i) + " ";
        }

        String[] items = text.split("\\s+");
        for (String currentItem: items) {
            System.out.print(currentItem + " ");
        }
    }
}
