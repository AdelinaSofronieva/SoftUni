package J07ReflectionAndAnnotation.Exercise.barracksWars.core.commands;

import J07ReflectionAndAnnotation.Exercise.barracksWars.annotations.Inject;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Repository;

public class ReportCommand extends Command{
    @Inject
    private Repository repository;


    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return repository.getStatistics();
    }


}