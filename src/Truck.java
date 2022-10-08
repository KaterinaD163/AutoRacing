public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    public void printTruck() {
        System.out.println(getBrand() + " " + getModel() + ", объём двигателя " + getEngineVolume() + " л ");
    }
        @Override
    public void startMoving() {
            System.out.println(" Начать движение");
    }

    @Override
    public void finishMoving() {
        System.out.println(" Закончить движение");
    }

    @Override
    public String toString() {
        return "Truck{}";
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public float getEngineVolume() {
        return super.getEngineVolume();
    }

    @Override
    public String pitStop() {
        System.out.println(" Здесь был пит-стоп");
        return null;
    }

    @Override
    public double bestRoundTime() {
        System.out.println(" Лучшее время круга - 6 минут");
        return 0;
    }

    @Override
    public double maxSpeed() {
        System.out.println(" Максимальная скорость - 170 км/ч");
        return 0;
    }
}
