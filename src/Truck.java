public class Truck extends Car{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике");
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}