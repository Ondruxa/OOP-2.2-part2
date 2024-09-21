public class Car extends EngineMachine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        super.checkEngine();
    }
}