public class Driver<B extends Car, C extends Truck, D extends Bus> {
    private String fullName;
    private String presenceOfDriverLicense;
    private int experience;
    private B categoryBDriver;
    private C categoryCDriver;
    private D categoryDDriver;


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
                ", experience='" + experience + '\'' +
                '}';
    }

    public static void categoryBDriver() {
        System.out.println("Водитель категории B");
        ;
    }

    public static void categoryCDriver() {
        System.out.println("Водитель категории C");
    }

    public static void categoryDDriver() {
        System.out.println("Водитель категории D");
    }


    public void startMoving(B categoryBDriver, D categoryDDriver, C categoryCDriver) {
        categoryBDriver.startMoving();
        System.out.println("Водителю категории B начать движение");

        categoryCDriver.startMoving();
        System.out.println("Водителю категории C начать движение");

        categoryDDriver.startMoving();
        System.out.println("Водителю категории D начать движение");
    }


    public void finishMoving(B categoryBDriver, D categoryDDriver, C categoryCDriver) {
        categoryBDriver.finishMoving();
        System.out.println("Водителю категории B закончить движение");

        categoryCDriver.finishMoving();
        System.out.println("Водителю категории C закончить движение");

        categoryDDriver.finishMoving();
        System.out.println("Водителю категории D закончить движение");
    }


    public void refill(B categoryBDriver, D categoryDDriver, C categoryCDriver) {
        System.out.println("Нужно срочно заправиться");
    }
}

