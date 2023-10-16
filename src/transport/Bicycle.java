package transport;

public class Bicycle extends Characteristic {

    private final static int WheelsCount = 2;

    public Bicycle(String modelName) {
        super(modelName, WheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживание велосипеда " + getModelName());
        super.check();
    }
}

