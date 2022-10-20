import java.util.ArrayList;

public class Mechanic {
    private String nameSurname;
    private String company;
    private ArrayList<Mechanic> mechanics;

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public Mechanic(String nameSurname, String company) {
        this.nameSurname = nameSurname;
        this.company = company;
        mechanics = new ArrayList<>();
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void fixCars() {
        System.out.println("Ремонтирует машину");
    }

    public void fixTruck() {
        System.out.println("Ремонтирует грузовик");
    }

    public void fixBuses() {
        System.out.println("Ремонтирует автобус");
    }

    public void fixAllTransport() {
        System.out.println("Ремонтирует все виды транспорта");
    }

    public void doMaintenance() {
        System.out.println("Проводит техобслуживание");
    }
}



