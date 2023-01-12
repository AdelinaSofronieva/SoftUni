package J04InterfacesAndAbstraction.Exercise.telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        boolean isDigit = false;

        for (String url : urls) {
            isDigit = false;
            for (char c : url.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(String.format("Invalid URL!%n"));

                    isDigit = true;
                    break;
                }
            }
            if (!isDigit) {
                sb.append(String.format("Browsing: %s!%n",url));
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        boolean isDigit = true;

        for (String number : numbers) {
            isDigit = true;
            for (char c : number.toCharArray()) {
                if (!Character.isDigit(c)) {
                    sb.append(String.format("Invalid number!%n"));

                    isDigit = false;
                    break;
                }
            }
            if (isDigit) {
                sb.append(String.format("Calling... %s%n", number));
            }
        }
        return sb.toString().trim();
    }
}
