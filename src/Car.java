public class Car extends Vehicle implements Servised{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на автомобиле");
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле");
    }
}
