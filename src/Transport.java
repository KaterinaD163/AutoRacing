public abstract class Transport extends Exception {
    private String brand;
    private String model;
    private float engineVolume;
    private double maxVolumeFraction;
    private String presenceOfDriverLicense;



//    private int productionYear;
//    private String productionCountry;
//    public String color;
//    public double maxSpeed;
//    public String typeOfFuel;


    public Transport(String brand, String model, float engineVolume, double maxVolumeFraction) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.maxVolumeFraction = maxVolumeFraction;
    }

    public abstract boolean passDiagnostics();

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public double getMaxVolumeFraction() {
        return maxVolumeFraction;
    }

    public void setMaxVolumeFraction(double maxVolumeFraction) {
        this.maxVolumeFraction = maxVolumeFraction;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void service() throws Exception;

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", maxVolumeFraction=" + maxVolumeFraction +
                ", presenceOfDriverLicense='" + presenceOfDriverLicense + '\'' +
                '}';
    }
}



//    public abstract void refill();
