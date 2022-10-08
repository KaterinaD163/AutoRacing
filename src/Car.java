public class Car extends Transport implements Competing{
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    public void printCar() {
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
        return "Car{}";
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
        return null;
    }

    @Override
    public double bestRoundTime() {
        System.out.println(" Лучшее время круга - 2 минуты");
        return 0;
    }

    @Override
    public double maxSpeed() {
        System.out.println(" Максимальная скорость - 300 км/ч");
        return 0;
    }
}
