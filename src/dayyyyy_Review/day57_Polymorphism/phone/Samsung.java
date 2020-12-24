package dayyyyy_Review.day57_Polymorphism.phone;

public class Samsung extends Phone implements AndroidApp{

    public Samsung(String brand, String model, String size, double price) {
        super("Samsung", model, size, price);
        if(price>1200){
            throw new RuntimeException("Samsung is getting greedy");
        }
    }

    public Samsung(String s20, String model, int i) {
        super();
    }

    @Override
    public void download() {
        System.out.println("Samsung is downloading from " + AppStoreName);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting " + phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling " + phoneNumber);

    }

    public void freezing(){
        System.out.println("Samsung is freezing again");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
