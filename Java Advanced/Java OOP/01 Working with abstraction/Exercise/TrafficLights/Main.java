package J01WorkingWithAbstraction.Exercise.TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] signals = scanner.nextLine().split("\\s+");
        int iterations = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLightList = Arrays.stream(signals)
                .map(Color::valueOf)
                .map(TrafficLight::new)
                .collect(Collectors.toList());

        while (iterations-- > 0) {
            for (TrafficLight trafficLight : trafficLightList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColorOfTrafficLights() + " ");
            }
            System.out.println();
        }
    }
}
