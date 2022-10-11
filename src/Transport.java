public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;

//    private int productionYear;
//    private String productionCountry;
//    public String color;
//    public double maxSpeed;
//    public String typeOfFuel;


    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishMoving();
}


//    public abstract void refill();
