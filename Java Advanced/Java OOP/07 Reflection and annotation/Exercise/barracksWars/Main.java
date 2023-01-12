package J07ReflectionAndAnnotation.Exercise.barracksWars;

import J07ReflectionAndAnnotation.Exercise.barracksWars.core.commands.CommandInterpreterImpl;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.CommandInterpreter;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Repository;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Runnable;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.UnitFactory;
import J07ReflectionAndAnnotation.Exercise.barracksWars.core.Engine;
import J07ReflectionAndAnnotation.Exercise.barracksWars.core.factories.UnitFactoryImpl;
import J07ReflectionAndAnnotation.Exercise.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);

        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}
