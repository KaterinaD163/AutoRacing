import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Car extends Transport implements Competing {

    public enum TypeOfFuel {
        SEDAN, HATH_BACK, COUPE, STATION_WAGON, SUV, CROSSOVER, PICKUP, VAN, MINIVAN;
        private static String typeOfFuel;
        private float volumeFraction;
        // private ArrayList<Car> cars;
        private Set<Car> cars;

//        public ArrayList<Car> getCars() {
//            return cars;
//        }

               TypeOfFuel() {
        }

        public void determineTypeOfCar() {
            if (typeOfFuel.isBlank()) {
                System.out.println("Данных недостаточно");
            } else {
                System.out.println(typeOfFuel);
            }
        }

        public static String getTypeOfFuel() {
            return typeOfFuel;
        }

        public static void setTypeOfFuel(String typeOfFuel) {
            TypeOfFuel.typeOfFuel = typeOfFuel;
        }
    }

//    public Car(String brand, String model, float engineVolume, double maxVolumeFraction) {
//        super(brand, model, engineVolume, maxVolumeFraction);
//        ArrayList<Car> cars = new ArrayList<>();
//    }


    public Car(String brand, String model, float engineVolume, double maxVolumeFraction) {
        super(brand, model, engineVolume, maxVolumeFraction);
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


    public void printCar() {
        System.out.println(getBrand() + " " + getModel() + ", объём двигателя " + getEngineVolume() + " л, выбросы CO в атмосферу " + getMaxVolumeFraction() + "%");
    }

    @Override
    public void startMoving() {
        System.out.println(" Водителю автомобиля начать движение");
    }

    @Override
    public void finishMoving() {
        System.out.println(" Водителю автомобиля закончить движение");
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
        return getModel() + " " + getBrand();
    }

    public void pitStop() {
        System.out.println(" Здесь был пит-стоп");
    }


    public void bestRoundTime() {
        System.out.println(" Лучшее время круга - 2 минуты");
    }


    public void maxSpeed() {
        System.out.println(" Максимальная скорость - 300 км/ч");
    }
}
