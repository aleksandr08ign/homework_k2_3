package transport;

public abstract class checkEngine extends Transport {

    public checkEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
