package dayyyyy_Review.day56_Abstraction;
/*
 2. create the following subclasses of phone:
                        1. IPhone
                        2. Samsung
            create constructors in each sub class that can initialize the instance variables
            if the price of iPhone or Samsung set to 0 or negative, program should throw an exception during runtime with an error message of "Invalid Price"
 */
public final class Iphone extends Phone {
    public Iphone(String brand, String model, double price, String size) {
        super("Iphone", model, price, size);
        if(price <0 || price >1500){
            throw new RuntimeException("The price " + price + " is invalid");
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling " + phoneNumber);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting " + phoneNumber);

    }

    public void faceTime(long phoneNumber){
        System.out.println("Iphone is facetiming " + phoneNumber);
    }

    public void faceTime(long phoneNumber1, long phoneNumber2){
        System.out.println(phoneNumber1 + " Iphone is facetiming with " + phoneNumber2);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
