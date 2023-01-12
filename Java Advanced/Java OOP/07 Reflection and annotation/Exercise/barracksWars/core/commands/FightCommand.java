package J07ReflectionAndAnnotation.Exercise.barracksWars.core.commands;

public class FightCommand extends Command{
    public FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}