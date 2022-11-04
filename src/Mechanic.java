import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Mechanic {
    private String nameSurname;
    private String company;
    //    private ArrayList<Mechanic> mechanics;
     private Set<Mechanic> mechanics;
//    public ArrayList<Mechanic> getMechanics() {
//        return mechanics;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return nameSurname.equals(mechanic.nameSurname) && company.equals(mechanic.company) && mechanics.equals(mechanic.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSurname, company, mechanics);
    }

    public Mechanic(String nameSurname, String company) {
        this.nameSurname = nameSurname;
        this.company = company;
        mechanics = new HashSet<>();
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

    @Override
    public String toString() {
        return "Mechanic{" +
                "nameSurname='" + nameSurname + '\'' +
                ", company='" + company + '\'' +
                ", mechanics=" + mechanics +
                '}';
    }
}



