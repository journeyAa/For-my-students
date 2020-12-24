package dayyyyy_Review.day56_Abstraction;

public final class SamSung extends Phone{
    public SamSung(String brand, String model, double price, String size) {
        super("Samsung", model, price, size);
        if(price <0 || price >1500){
            throw new RuntimeException("The price " + price + " is invalid");
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling " + phoneNumber);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is calling " + phoneNumber);

    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "SamSung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", $price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
