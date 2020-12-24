package dayyyyy_Review.day57_Polymorphism.phone;

public class HuaWei extends Phone implements AndroidApp, AppleApp, Downloadable{

    public HuaWei(String brand, String model, String size, double price) {
        super(brand, model, size, price);
    }

    @Override
    public void download() {
        System.out.println("Huawei downloads from " + AndroidApp.AppStoreName + " and " + AppleApp.AppStoreName);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is texting to " + phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is calling " + phoneNumber);

    }

    public void spying(){
        System.out.println("they always spy on others");
    }

    @Override
    public String toString() {
        return "HuaWei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
