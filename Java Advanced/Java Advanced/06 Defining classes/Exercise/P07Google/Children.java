package J06DefiningClasses.Exercise.P07Google;

public class Children {
    private String childName;
    private String childBirthday;

    public Children(String childNAme, String childBirthday) {
        this.childName = childNAme;
        this.childBirthday = childBirthday;
    }

    public String format(){
        return String.format("%s %s", childName, childBirthday);
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    public void setChildBirthday(String childBirthday) {
        this.childBirthday = childBirthday;
    }
}
