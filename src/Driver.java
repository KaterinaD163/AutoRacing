public class Driver<T extends Transport> {
    private String fullName;
    private String presenceOfDriverLicense;
    private int experience;
    private T Transport;

    public Driver(String fullName, String presenceOfDriverLicense, int experience) throws Exception {
        this.fullName = fullName;
        setPresenceOfDriverLicense(presenceOfDriverLicense);
        this.experience = experience;
    }

    public void printDriver() {
        System.out.println(getFullName() + ", " + getPresenceOfDriverLicense() + ", стаж " + getExperience() + " лет");
    }

    public String getFullName() {
        return fullName;
    }

    public String getPresenceOfDriverLicense()throws NullPointerException {
        if (presenceOfDriverLicense.isBlank() || presenceOfDriverLicense == null) {
            try {
                throw new NullPointerException("Необходимо указать категорию прав!");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
        return presenceOfDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setPresenceOfDriverLicense(String presenceOfDriverLicense) {
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
                ", experience=" + experience +
                ", Transport=" + Transport +
                '}';
    }

    public void startMoving(T transport) {
        Transport.startMoving();
        System.out.println("Начать движение");
    }


    public void finishMoving(T transport) {
        Transport.finishMoving();
        System.out.println("Закончить движение");
    }


    public void refill(T transport) {
        System.out.println("Нужно срочно заправиться");

    }

    public void checkDriverLicense() throws NullPointerException{
        if (presenceOfDriverLicense.isBlank() || presenceOfDriverLicense == null) {
            try {
                throw new NullPointerException("Необходимо указать категорию прав!");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
