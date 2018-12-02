package main.java.vehicles;

public class Bicycle {
    final int gears = 7;
    final double tyreSize = 27.0;
    private double currentSpeed = 0;
    private static String colour;

    public Bicycle() { //
        colour = "white";
    }

    public Bicycle(String randomColour) {
        colour = randomColour;
    }

    void setCurrentSpeed(double newSpeed){
        currentSpeed = newSpeed;
    }

    double getCurrentSpeed() {
        return currentSpeed;
    }
}
