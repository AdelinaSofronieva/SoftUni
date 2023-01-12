package J01WorkingWithAbstraction.Exercise.TrafficLights;

public class TrafficLight {
    private Color colorOfTrafficLights;

    public TrafficLight(Color colorOfTrafficLights) {
        this.colorOfTrafficLights = colorOfTrafficLights;
    }

    public void changeColor() {
        switch (colorOfTrafficLights) {
            case RED :
                colorOfTrafficLights = Color.GREEN;
                break;
            case GREEN:
                colorOfTrafficLights = Color.YELLOW;
                break;
            case YELLOW:
                colorOfTrafficLights = Color.RED;
                break;
        }
    }

    public Color getColorOfTrafficLights() {
        return colorOfTrafficLights;
    }

    public void setColorOfTrafficLights(Color colorOfTrafficLights) {
        this.colorOfTrafficLights = colorOfTrafficLights;
    }
}
