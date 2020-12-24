package dayyyyy_Review.day56_Abstraction;
/*
Warmup tasks:
    1. create an abstract class called Phone
            attributes: brand, model, price, size
            abstract methods: calling(), texting();
            instance method: toString()
            add a constructor that can initialize all the instances

 */

public abstract class Phone {
    public String brand;
    public String model;
    public double price;
    public String size;

    public Phone(String brand, String model, double price, String size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public abstract void calling(long phoneNumber);

    public abstract void texting(long phoneNumber);



    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
