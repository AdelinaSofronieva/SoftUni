package J06DefiningClasses.Exercise.P07Google;

public class Parent {
    private String parentName;
    private String parentBirthday;

    public Parent(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    public String format(){
        return String.format("%s %s", parentName, parentBirthday);
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentBirthday() {
        return parentBirthday;
    }

    public void setParentBirthday(String parentBirthday) {
        this.parentBirthday = parentBirthday;
    }
}
