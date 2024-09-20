public abstract class Machine {
    protected String modelName;
    protected int wheelsCount;

    public Machine(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
}
