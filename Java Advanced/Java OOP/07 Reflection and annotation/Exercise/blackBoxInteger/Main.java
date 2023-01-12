package J07ReflectionAndAnnotation.Exercise.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);


        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Field hiddenValue = clazz.getDeclaredField("innerValue");
        hiddenValue.setAccessible(true);

        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            String[] commandParts = command.split("_");
            String currentCommand = commandParts[0];
            int currentValue = Integer.parseInt(commandParts[1]);

            Method method = clazz.getDeclaredMethod(currentCommand, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, currentValue);


            System.out.println(hiddenValue.get(blackBoxInt));
            command = scanner.nextLine();
        }
    }
}
