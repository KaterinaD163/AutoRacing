public class Driver<T extends Transport> {
    private String fullName;
    private String presenceOfDriverLicense;
    private int experience;
    private T Transport;

    public Driver(String fullName, String presenceOfDriverLicense, int experience) {
        this.fullName = fullName;
        this.presenceOfDriverLicense = presenceOfDriverLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPresenceOfDriverLicense() {
        return presenceOfDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setPresenceOfDriverLicense(String PresenceOfDriverLicense) {
        this.presenceOfDriverLicense = presenceOfDriverLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", presenceOfDriverLicense='" + presenceOfDriverLicense + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }

    public void startMoving(T Transport) {
        Transport.startMoving();
        System.out.println("Водителю категории B начать движение");
    }


    public void finishMoving(T Transport) {
     Transport.finishMoving();
        System.out.println("Водителю категории B закончить движение");
    }


    public void refill(T Transport) {
        System.out.println("Нужно срочно заправиться");
    }
}

