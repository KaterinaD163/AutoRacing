public class Car extends Transport implements Competing {
    public enum TypeOfFuel {
        SEDAN, HATH_BACK, COUPE, STATION_WAGON, SUV, CROSSOVER, PICKUP, VAN, MINIVAN;
        private static String typeOfFuel;

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

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void printCar() {
        System.out.println(getBrand() + " " + getModel() + ", объём двигателя " + getEngineVolume() + " л ");
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
    public String toString() {
        return "Car{}";
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
