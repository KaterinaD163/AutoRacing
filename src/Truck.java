import java.util.ArrayList;

public class Truck extends Transport implements Competing {
    private ArrayList<Truck> trucks;

    public ArrayList<Truck> getTrucks() {
        return trucks;
    }

    public enum LoadTonnage {
        FIRST, SECOND, THIRD;

        private String first = " №1 (с полной массой до 3,5 тонн)";
        private String second = " №2 с полной массой свыше 3,5 до 12 тонн)";
        private String third = " №3 (с полной массой свыше 12 тонн)";

        LoadTonnage() {
        }

        public String getFirst() {
            return first;
        }

        public String getSecond() {
            return second;
        }

        public String getThird() {
            return third;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        public void setThird(String third) {
            this.third = third;
        }
    }


    public Truck(String brand, String model, float engineVolume, double maxVolumeFraction) {
        super(brand, model, engineVolume, maxVolumeFraction);
        trucks = new ArrayList<>();
    }

    @Override
    public boolean passDiagnostics() {
        if (getMaxVolumeFraction() <= 4.5) {
            System.out.println("Выбросы CO в атмосферу не превышены");
        } else {
            System.out.println("Пройти дигностику");
        }
        return false;
    }
    public void printLoadTonnage() {
    }

    public void printTruck() {
        System.out.println(getBrand() + " " + getModel() + ", объём двигателя " + getEngineVolume() + " л, выбросы CO в атмосферу " + getMaxVolumeFraction() + "%");
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
    public void service() throws Exception {
        if (getMaxVolumeFraction() > 4.5) {
            try {
                throw new Exception(getBrand() + " " + getModel() + " срочно нуждается в сервисном обслуживании");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
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
