package J07ReflectionAndAnnotation.Exercise.barracksWars.core.commands;

import J07ReflectionAndAnnotation.Exercise.barracksWars.annotations.Inject;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Repository;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Unit;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.UnitFactory;

public class AddCommand extends Command{
    @Inject
    private Repository repository;
    @Inject
    private UnitFactory unitFactory;

    public AddCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = unitFactory.createUnit(unitType);
        repository.addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}