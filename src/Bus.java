
public class Bus extends Transport implements Competing {
    public enum numberOfSeats {veryFewSeats, fewSeats, averageNumberOfSeats, lotsOfSeats, aLotOfSeats}


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
        final String veryFewSeats = " 10 мест";
        final String second = " 25 мест";
        final String averageNumberOfSeats = " 40-50 мест";
        final String lotsOfSeats = " 60-80 мест";
        final String aLotOfSeats = " 100-120 мест";
        return "Bus{}";
    }


    public void pitStop() {
        System.out.println(" Здесь был пит-стоп");
    }


    public void bestRoundTime() {
        System.out.println(" Лучшее время круга - 4 минуты");

    }


    public void maxSpeed() {
        System.out.println(" Максимальная скорость - 250 км/ч");
    }
}


