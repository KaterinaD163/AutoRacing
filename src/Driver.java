public abstract class Driver {
    private String fullName;
    private String presenceOfDriverLicense;
    private int experience;

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

    public abstract void startMoving();

    public abstract void stop();

    public abstract void refill();

}


