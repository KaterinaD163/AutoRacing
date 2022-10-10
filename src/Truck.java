public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void printTruck() {
        System.out.println(getBrand() + " " + getModel() + ", объём двигателя " + getEngineVolume() + " л ");
    }

    @Override
    public void startMoving() {
        System.out.println(" Водителю грузовика начать движение");
    }

    @Override
    public void finishMoving() {
        System.out.println(" Водителю грузовика закончить движение");
    }

    @Override
    public String toString() {
        return "Truck{}";
    }


    public static void pitStop() {
        System.out.println(" Здесь был пит-стоп");

    }


    public static void bestRoundTime() {
        System.out.println(" Лучшее время круга - 6 минут");
    }


    public static void maxSpeed() {
        System.out.println(" Максимальная скорость - 170 км/ч");

    }
}
