public class Truck extends Transport implements Competing {
    public enum loadTonnage {first, second, third}


    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);

    }

    public void printLoadTonnage() {
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
        final String first = " №1 (с полной массой до 3,5 тонн)";
        final String second = " №2 с полной массой свыше 3,5 до 12 тонн)";
        final String third = " №3 (с полной массой свыше 12 тонн)";

        return "Truck{}";
    }


    public void pitStop() {
        System.out.println(" Здесь был пит-стоп");

    }


    public void bestRoundTime() {
        System.out.println(" Лучшее время круга - 6 минут");
    }


    public void maxSpeed() {
        System.out.println(" Максимальная скорость - 170 км/ч");
    }
}
