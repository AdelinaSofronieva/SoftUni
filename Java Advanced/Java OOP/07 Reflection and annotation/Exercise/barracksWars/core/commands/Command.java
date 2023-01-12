package J07ReflectionAndAnnotation.Exercise.barracksWars.core.commands;

import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Executable;

public abstract class Command implements Executable {
    private String[] data;


    public Command(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }

}
