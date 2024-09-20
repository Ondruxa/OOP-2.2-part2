public class Truck extends Machine{

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}