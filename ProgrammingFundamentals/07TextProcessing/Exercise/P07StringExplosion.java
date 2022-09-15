package F10TextProcessing.Exercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputText =  new StringBuilder(scanner.nextLine());

        int totalStrength = 0;
        //abv>1>1>2>2asdasd
        for (int i = 0; i <inputText.length() ; i++) {
            char currentSymbol = inputText.charAt(i);
            if (currentSymbol == '>') {
                int currentStrength = Integer.parseInt(inputText.charAt(i + 1) + "");
                //Integer.parseInt(text.charAt(i + 1) + "")
                totalStrength += currentStrength;
            } else if (totalStrength > 0) {
                inputText.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }

        System.out.println(inputText);
    }
}
