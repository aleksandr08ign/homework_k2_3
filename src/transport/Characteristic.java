package transport;

import service.Serviceable;

public abstract class Characteristic implements Serviceable {
    public String modelName;
    public int wheelsCount;

    public Characteristic(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    @Override
    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

}
