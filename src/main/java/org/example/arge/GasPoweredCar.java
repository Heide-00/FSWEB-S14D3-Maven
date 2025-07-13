package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private double averageKmPerLiter;

    private int cylinders;

    public GasPoweredCar(String name, String description, double avarageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = avarageKmPerLiter;
        this.cylinders = cylinders;

    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + "car starting...";
    }

    @Override
    public String drive() {
        return "run from GasPowered car";
    }


    public double getAvarageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
