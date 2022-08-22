public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на автомобиле");
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле");
    }
}
