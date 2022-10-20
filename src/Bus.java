import java.util.ArrayList;

public class Bus extends Transport implements Competing {
    public enum NumberOfSeats {
        VERY_FEW_SEATS, FEW_SEATS, AVERAGE_NUMBER_OF_SEATS, LOTS_OF_SEATS, A_LOT_OF_SEATS;
        private ArrayList<Bus> buses;
        private String VeryFewSeats = " 10 мест";
        private String second = " 25 мест";
        private String averageNumberOfSeats = " 40-50 мест";
        private String lotsOfSeats = " 60-80 мест";
        private String aLotOfSeats = " 100-120 мест";

        public ArrayList<Bus> getBuses() {
            return buses;
        }

        NumberOfSeats() {
        }


        public String getVeryFewSeats() {
            return VeryFewSeats;
        }

        public String getSecond() {
            return second;
        }

        public String getAverageNumberOfSeats() {
            return averageNumberOfSeats;
        }

        public String getLotsOfSeats() {
            return lotsOfSeats;
        }

        public String getaLotOfSeats() {
            return aLotOfSeats;
        }

        public void setVeryFewSeats(String veryFewSeats) {
            VeryFewSeats = veryFewSeats;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        public void setAverageNumberOfSeats(String averageNumberOfSeats) {
            this.averageNumberOfSeats = averageNumberOfSeats;
        }

        public void setLotsOfSeats(String lotsOfSeats) {
            this.lotsOfSeats = lotsOfSeats;
        }

        public void setALotOfSeats(String aLotOfSeats) {
            this.aLotOfSeats = aLotOfSeats;
        }
    }

    public Bus(String brand, String model, float engineVolume, double maxVolumeFraction) {
        super(brand, model, engineVolume, maxVolumeFraction);
        ArrayList<Bus> buses = new ArrayList<>();
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в дигностике не нуждается");
        return true;
    }

    public void printBus() {
        System.out.println(getBrand() + " " + getModel() + ", объём двигателя " + getEngineVolume() + " л, выбросы CO в атмосферу " + getMaxVolumeFraction() + "%");
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
    public void service() {
        System.out.println("В сервисном обслуживании не нуждается");
    }

    @Override
    public String toString() {

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


