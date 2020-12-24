package dayyyyy_Review.day57_Polymorphism.phone;

public abstract class Phone {

    public String brand, model, size;
    public double price;

    public Phone(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;

        if(price <0 || price > 2000){
            throw new RuntimeException("Price of the phone is invalid");
        }
        this.price = price;
    }

    public Phone() {

    }

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);






}
