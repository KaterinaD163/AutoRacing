

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Grande", 1.7f);
        car1.printCar();
        car1.startMoving();
        car1.finishMoving();
        car1.pitStop();
        car1.bestRoundTime();
        car1.maxSpeed();
        System.out.println();
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0f);
        car2.printCar();
        car2.startMoving();
        car2.finishMoving();
        car2.pitStop();
        car2.bestRoundTime();
        car2.maxSpeed();
        System.out.println();
        Car car3 = new Car("BMW", "Z8", 2.7f);
        car3.printCar();
        car3.startMoving();
        car3.finishMoving();
        car3.pitStop();
        car3.bestRoundTime();
        car3.maxSpeed();
        System.out.println();
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.4f);
        car4.printCar();
        car4.startMoving();
        car4.finishMoving();
        car4.pitStop();
        car4.bestRoundTime();
        car4.maxSpeed();
        System.out.println();
        Truck truck1 = new Truck("БелАЗ", "тягач", 3.4f);
        truck1.printTruck();
        truck1.startMoving();
        truck1.finishMoving();
        truck1.pitStop();
        truck1.bestRoundTime();
        truck1.maxSpeed();
        System.out.println();
        Truck truck2 = new Truck("МАЗ", "перевозчик", 4.5f);
        truck2.printTruck();
        truck2.startMoving();
        truck2.finishMoving();
        truck1.pitStop();
        truck1.bestRoundTime();
        truck1.maxSpeed();
        System.out.println();
        Truck truck3 = new Truck("МТЗ", "еврофура", 4.3f);
        truck3.printTruck();
        truck3.startMoving();
        truck3.finishMoving();
        truck3.pitStop();
        truck3.bestRoundTime();
        truck3.maxSpeed();
        System.out.println();
        Truck truck4 = new Truck("МЗКТ", "полуприцеп", 3.5f);
        truck4.printTruck();
        truck4.startMoving();
        truck4.finishMoving();
        truck4.pitStop();
        truck4.bestRoundTime();
        truck4.maxSpeed();
        System.out.println();
        Bus bus1 = new Bus("Икарус", "И-53", 3.2f);
        bus1.printBus();
        bus1.startMoving();
        bus1.finishMoving();
        bus1.pitStop();
        bus1.bestRoundTime();
        bus1.maxSpeed();
        System.out.println();
        Bus bus2 = new Bus("ПАЗ", "П-2", 2.7f);
        bus2.printBus();
        bus2.startMoving();
        bus2.finishMoving();
        bus2.pitStop();
        bus2.bestRoundTime();
        bus2.maxSpeed();
        System.out.println();
        Bus bus3 = new Bus("ЛиАЗ", "Л-38", 2.5f);
        bus3.printBus();
        bus3.startMoving();
        bus3.finishMoving();
        bus3.pitStop();
        bus3.bestRoundTime();
        bus3.maxSpeed();
        System.out.println();
        Bus bus4 = new Bus("МОДИМИО", "Я-6", 1.7f);
        bus4.printBus();
        bus4.startMoving();
        bus4.finishMoving();
        bus4.pitStop();
        bus4.bestRoundTime();
        bus4.maxSpeed();
        System.out.println();
        Driver<Transport> driver1 = new Driver<>("Павлов Иван Фёдорович", "права есть", 20);
        Driver<Transport> driver2 = new Driver<>("Финютин Иван Григорьевич", "права есть", 5);
        Driver<Transport> driver3 = new Driver<>("Загородцев Андрей Алексеевич", "права есть", 5);
        System.out.println(driver1.getFullName() + " управляет автомобилем " + car1.getBrand() + " "
                + car1.getModel() + " и будет участвовать в заезде");
        System.out.println();

        System.out.println(driver2.getFullName() + " управляет грузовиком " + truck1.getBrand() + " "
                + truck1.getModel() + " и будет участвовать в заезде");
        System.out.println();

        System.out.println(driver3.getFullName() + " управляет автобусом " + bus1.getBrand() + " "
                + bus1.getModel() + " и будет участвовать в заезде");

    }
}