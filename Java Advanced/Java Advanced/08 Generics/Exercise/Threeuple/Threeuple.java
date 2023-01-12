package J08Generics.Exercise.Threeuple;

public class Threeuple<F, S, T> {
    private F first;
    private S second;
    private T third;

    public Threeuple(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static String drunkOrNot(String element) {
        String result;
        if (element.equals("drunk")) {
            result = "true";
        } else {
            result = "false";
        }

        return result;
    }

    public String toString() {
        return String.format("%s -> %s -> %s", first, second, third);
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }
}
