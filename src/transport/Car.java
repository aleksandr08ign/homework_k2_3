package transport;

public class Car extends Engine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживание легкового авто " + getModelName());
        super.check();
    }
}

