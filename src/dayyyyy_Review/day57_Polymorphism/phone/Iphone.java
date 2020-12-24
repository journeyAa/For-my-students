package dayyyyy_Review.day57_Polymorphism.phone;

public class Iphone extends Phone implements AppleApp, Downloadable {


    public Iphone(String brand, String model, String size, double price) {
        super("Iphone", model, size, price);
        if(price > 1500){
            throw new RuntimeException("Iphone is getting greedy");
        }
    }

    public Iphone(String brand, String model, int i) {
        super();
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting " + phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling " + phoneNumber);

    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading an app from " + AppStoreName);

    }

    public void faceTime(long phoneNumber){
        System.out.println("Iphone is facetiming with " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", $price=" + price +
                '}';
    }
}
