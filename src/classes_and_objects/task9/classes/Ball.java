package classes_and_objects.task9.classes;

public class Ball {

    private final String colour;
    private final double weight;

    public Ball (String colour, double weight) {

        if (weight <= 0) {
            throw new IllegalArgumentException("Negative weight");
        }
        if ((colour == null)) {
            throw new IllegalArgumentException("Ball should have a color");
        }

        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }
}