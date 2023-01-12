package J07ReflectionAndAnnotation.Exercise.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Class richSoilLand = RichSoilLand.class;

		Field[] fields = richSoilLand.getDeclaredFields();

		Consumer<Field> printer = field -> System.out.printf("%s %s %s%n",
				Modifier.toString(field.getModifiers()),
				field.getType().getSimpleName(),
				field.getName());

		String command = scanner.nextLine();
		while (!command.equals("HARVEST")) {
			switch (command) {
				case "private" :
					Arrays.stream(fields)
							.filter(field -> Modifier.isPrivate(field.getModifiers()))
							.forEach(printer);
					break;
				case "protected" :
					Arrays.stream(fields)
							.filter(field -> Modifier.isProtected(field.getModifiers()))
							.forEach(printer);
					break;
				case "public" :
					Arrays.stream(fields)
							.filter(field -> Modifier.isPublic(field.getModifiers()))
							.forEach(printer);
					break;
				case "all" :
					Arrays.stream(fields)
							.forEach(printer);
					break;
			}


			command = scanner.nextLine();
		}
	}
}
