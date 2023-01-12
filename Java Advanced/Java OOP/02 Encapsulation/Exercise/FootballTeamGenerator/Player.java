package J02Encapsulation.Exercise.FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void checkStatRange(int stat, String statName){
        if (stat < 0 || stat > 100) {
            throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", statName));
        }
    }

    private void setEndurance(int endurance) {
        checkStatRange(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        checkStatRange(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        checkStatRange(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        checkStatRange(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        checkStatRange(shooting, "Shooting");
        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.0;
    }


}
