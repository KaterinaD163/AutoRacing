
public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void printBus() {
        System.out.println(getBrand() + " " + getModel() + ", объём двигателя " + getEngineVolume() + " л  ");
    }

    @Override
    public void startMoving() {
        System.out.println(" Водителю автобуса начать движение");
    }

    @Override
    public void finishMoving() {
        System.out.println(" Водителю автобуса закончить движение");
    }

    @Override
    public String toString() {
        return "Bus{}";
    }


    public static void pitStop() {
        System.out.println(" Здесь был пит-стоп");
    }


    public static void bestRoundTime() {
        System.out.println(" Лучшее время круга - 4 минуты");

    }


    public void maxSpeed() {
        System.out.println(" Максимальная скорость - 250 км/ч");

    }
}


