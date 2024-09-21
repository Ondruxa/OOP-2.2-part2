public abstract class Machine implements Serviceable {
    protected final String modelName;
    protected final int wheelsCount;

    public Machine(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}

