package J07ReflectionAndAnnotation.Lab;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class aClass = Reflection.class;

        //Class reflection1 = Class.forName(J07ReflectionAndAnnotation.Lab.Reflection);

//        String className = aClass.getName();
//        String simpleClassName = aClass.getSimpleName();
//        Class[] interfaces = aClass.getInterfaces();

/*        System.out.println(aClass);
        System.out.println(aClass.getSuperclass());

        Arrays.stream(interfaces)
                .forEach(System.out::println);

        J07ReflectionAndAnnotation.Lab.Reflection reflectionConstructor = (J07ReflectionAndAnnotation.Lab.Reflection) aClass.getDeclaredConstructor().newInstance();
        System.out.println(reflectionConstructor);*/

//        Method[] methods = J07ReflectionAndAnnotation.Lab.Reflection.class.getDeclaredMethods();
//
//        Arrays.stream(methods)
//                .filter(method -> method.getName().startsWith("get") && method.getParameterCount() == 0)
//                .sorted(Comparator.comparing(Method::getName))
//                .forEach(method -> System.out.printf("%s will return class %s%n",
//                                method.getName(), method.getReturnType()));
//
//        Arrays.stream(methods)
//                .filter(method -> method.getName().startsWith("set") && method.getParameterCount() == 1)
//                .sorted(Comparator.comparing(Method::getName))
//                .forEach(method -> System.out.printf("%s will return class %s%n",
//                                method.getName(), method.getParameterTypes()[0].getName()));

        Field[] fields = aClass.getDeclaredFields();

        Arrays.stream(fields)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted((Comparator.comparing(Field::getName)))
                .forEach(f -> System.out
                        .printf("%s must be private!%n", f.getName()));

        Method[] methods = aClass.getDeclaredMethods();

        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("get") && method.getParameterCount() == 0)
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .sorted((Comparator.comparing(Method::getName)))
                .forEach(f -> System.out
                        .printf("%s must be public!%n", f.getName()));

        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("set") && method.getParameterCount() == 1)
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .sorted((Comparator.comparing(Method::getName)))
                .forEach(f -> System.out
                        .printf("%s must be public!%n", f.getName()));


    }
}
