package Auto;

public abstract class AutoMobile {
    private String model;
    private Integer maxSpeed;
    protected Integer price;
    public AutoMobile (String model, Integer maxspeed)
    {
        this.model = model;
        this.maxSpeed = maxspeed;
        price = maxspeed * 100;
    }

    public void update(){
        this.maxSpeed+=10;
        price += 1000;
    };
    public void information()
    {
        System.out.println("Model : " + model + "\n" +
        "Maxspeed : " + maxSpeed + "\n" +
        "price: " + price);
    }
}
