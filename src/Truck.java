public class Truck extends EngineMachine {

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        super.checkEngine();
        checkTrailer();

    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}