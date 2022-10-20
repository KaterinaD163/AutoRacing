import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Lada", "Grande", 1.7f, 2.3);
        car1.printCar();
        car1.startMoving();
        car1.finishMoving();
        car1.pitStop();
        car1.bestRoundTime();
        car1.maxSpeed();
        car1.passDiagnostics();
        car1.service();
        System.out.println();
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, 2.6);
        car2.printCar();
        car2.startMoving();
        car2.finishMoving();
        car2.pitStop();
        car2.bestRoundTime();
        car2.maxSpeed();
        car2.passDiagnostics();
        car2.service();
        System.out.println();
        Car car3 = new Car("BMW", "Z8", 2.7f, 5.0);
        car3.printCar();
        car3.startMoving();
        car3.finishMoving();
        car3.pitStop();
        car3.bestRoundTime();
        car3.maxSpeed();
        car3.passDiagnostics();
        car3.service();
        System.out.println();
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.4f, 3.4);
        car4.printCar();
        car4.startMoving();
        car4.finishMoving();
        car4.pitStop();
        car4.bestRoundTime();
        car4.maxSpeed();
        car4.passDiagnostics();
        car4.service();
        System.out.println();
        Truck truck1 = new Truck("БелАЗ", "тягач", 3.4f, 5.6);
        truck1.printTruck();
        truck1.startMoving();
        truck1.finishMoving();
        truck1.pitStop();
        truck1.bestRoundTime();
        truck1.maxSpeed();
        truck1.passDiagnostics();
        truck1.service();
        System.out.println();
        Truck truck2 = new Truck("МАЗ", "перевозчик", 4.5f, 3.7);
        truck2.printTruck();
        truck2.startMoving();
        truck2.finishMoving();
        truck1.pitStop();
        truck1.bestRoundTime();
        truck1.maxSpeed();
        truck2.passDiagnostics();
        truck2.service();
        System.out.println();
        Truck truck3 = new Truck("МТЗ", "еврофура", 4.3f, 4.4);
        truck3.printTruck();
        truck3.startMoving();
        truck3.finishMoving();
        truck3.pitStop();
        truck3.bestRoundTime();
        truck3.maxSpeed();
        truck3.passDiagnostics();
        truck3.service();
        System.out.println();
        Truck truck4 = new Truck("МЗКТ", "полуприцеп", 3.5f, 4.5);
        truck4.printTruck();
        truck4.startMoving();
        truck4.finishMoving();
        truck4.pitStop();
        truck4.bestRoundTime();
        truck4.maxSpeed();
        truck4.passDiagnostics();
        truck4.service();
        System.out.println();
        Bus bus1 = new Bus("Икарус", "И-53", 3.2f, 3.0);
        bus1.printBus();
        bus1.startMoving();
        bus1.finishMoving();
        bus1.pitStop();
        bus1.bestRoundTime();
        bus1.maxSpeed();
        bus1.passDiagnostics();
        bus1.service();
        System.out.println();
        Bus bus2 = new Bus("ПАЗ", "П-2", 2.7f, 3.4);
        bus2.printBus();
        bus2.startMoving();
        bus2.finishMoving();
        bus2.pitStop();
        bus2.bestRoundTime();
        bus2.maxSpeed();
        bus2.passDiagnostics();
        bus2.service();
        System.out.println();
        Bus bus3 = new Bus("ЛиАЗ", "Л-38", 2.5f, 3.7);
        bus3.printBus();
        bus3.startMoving();
        bus3.finishMoving();
        bus3.pitStop();
        bus3.bestRoundTime();
        bus3.maxSpeed();
        bus3.passDiagnostics();
        bus3.service();
        System.out.println();
        Bus bus4 = new Bus("МОДИМИО", "Я-6", 1.7f, 3.6);
        bus4.printBus();
        bus4.startMoving();
        bus4.finishMoving();
        bus4.pitStop();
        bus4.bestRoundTime();
        bus4.maxSpeed();
        bus4.passDiagnostics();
        bus4.service();
        System.out.println();
        Driver<Transport> driver1 = new Driver<>("Павлов Иван Фёдорович", "права категории В", 20);
        Driver<Transport> driver2 = new Driver<>("Финютин Иван Григорьевич", "права категории С", 5);
        Driver<Transport> driver3 = new Driver<>("Загородцев Андрей Алексеевич", "права категории D", 5);
        driver1.checkDriverLicense();
        driver2.checkDriverLicense();
        driver3.checkDriverLicense();
        System.out.println(driver1.getFullName() + " управляет автомобилем " + car1.getBrand() + " "
                + car1.getModel() + " (" + driver1.getPresenceOfDriverLicense() + ") и будет участвовать в заезде");
        System.out.println();

        System.out.println(driver2.getFullName() + " управляет грузовиком " + truck1.getBrand() + " "
                + truck1.getModel() + " (" + driver2.getPresenceOfDriverLicense() + ") и будет участвовать в заезде");
        System.out.println();

        System.out.println(driver3.getFullName() + " управляет автобусом " + bus1.getBrand() + " "
                + bus1.getModel() + " (" + driver3.getPresenceOfDriverLicense() + ") и будет участвовать в заезде");
        System.out.println();
        System.out.println(Car.TypeOfFuel.COUPE);
        System.out.println(Truck.LoadTonnage.FIRST);
        System.out.println(Bus.NumberOfSeats.FEW_SEATS);


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        trucks.add(truck4);
        System.out.println();
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);
        buses.add(bus4);
        Sponsor sponsor1 = new Sponsor("Ростелеком", 150_000);
        Sponsor sponsor2 = new Sponsor("БелАвиа", 1_500_000);
        Sponsor sponsor3 = new Sponsor("Банк ВТБ", 2_000_000);
        Sponsor sponsor4 = new Sponsor("Банк Открытие", 1_700_000);
        ArrayList<Sponsor> sponsors = new ArrayList<>();
        sponsors.add(sponsor1);
        sponsors.add(sponsor2);
        sponsors.add(sponsor3);
        sponsors.add(sponsor4);
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        Mechanic mechanic1 = new Mechanic("Павел Фёдоров", "Good mechanics");
        Mechanic mechanic2 = new Mechanic("Константин Симонов", "Good mechanics");
        Mechanic mechanic3 = new Mechanic("Филипп Загорский", "Good mechanics");
        Mechanic mechanic4 = new Mechanic("Михаил Матвеев", "Good mechanics");
        Mechanic mechanic5 = new Mechanic("Артём Задорнов", "Good mechanics");
        Mechanic mechanic6 = new Mechanic("Дмитрий Павелев", "Good mechanics");
        Mechanic mechanic7 = new Mechanic("Максим Воронцов", "Good mechanics");
        Mechanic mechanic8 = new Mechanic("Олег Мускатин", "Good mechanics");
        Mechanic mechanic9 = new Mechanic("Кирилл Ленивцев", "Good mechanics");
        ArrayList<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);
        mechanics.add(mechanic4);
        mechanics.add(mechanic5);
        mechanics.add(mechanic6);
        mechanics.add(mechanic7);
        mechanics.add(mechanic8);
        mechanics.add(mechanic9);
//        System.out.println(driver1.getFullName() + " управляет автомобилем " + car1.getBrand() + " "
//                + car1.getModel() + ". Спонсор " + sponsor1.getName() + ", который спонсировал заезд на " + sponsor1.getContribution() +
//                " рублей, механик " + mechanic1.getNameSurname() + " от компании " + mechanic1.getCompany());

        System.out.print(drivers.get(0).getFullName() + " управляет автомобилем " + cars.get(0).getBrand() + " "
                + cars.get(0).getModel() + ".");
        for (int i = 0; i < sponsors.size(); i++) {
            System.out.print(" Спонсор " + sponsors.get(i).getName() + ", который спонсировал заезд на " +
                    sponsors.get(i).getContribution() + " рублей;");
        }
        for (int a = 0; a < mechanics.size(); a++) {
            System.out.print(", механик " + mechanics.get(a).getNameSurname() +
                    " от компании " + mechanics.get(a).getCompany());
        }
        ServiceStation<Transport> serviceStation = new ServiceStation<>();
        serviceStation.addTransport(car1);
        serviceStation.addTransport(car2);
        serviceStation.addTransport(car3);
        serviceStation.addTransport(car4);
        serviceStation.addTransport(truck1);
        serviceStation.addTransport(truck2);
        serviceStation.addTransport(truck3);
        serviceStation.addTransport(truck4);
        serviceStation.doInspection();
    }
}
