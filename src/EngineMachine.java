public abstract class EngineMachine extends Machine {
    public EngineMachine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
    }
}
