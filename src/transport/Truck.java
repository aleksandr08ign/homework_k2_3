package transport;

public class Truck extends Engine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Обслуживание грузовоо авто " + getModelName());
        super.check();
        checkTrailer();
    }
}
