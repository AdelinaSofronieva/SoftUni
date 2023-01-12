package J07ReflectionAndAnnotation.Exercise.barracksWars.core.commands;

import J07ReflectionAndAnnotation.Exercise.barracksWars.annotations.Inject;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Repository;

public class RetireCommand extends Command{
    @Inject
    private Repository repository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        try{
            String unitType = getData()[1];
            repository.removeUnit(unitType);
            return String.format("%s retired!", unitType);
        } catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
}