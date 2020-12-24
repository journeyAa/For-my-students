package Practice.practice_Abstraction.day56.PhoneTask;

public class Iphone extends Phone{

    public Iphone(String brand, String model, double price, String size){
        super("Iphone", model, price, size);
        if(price<= 0 || price> 1500){
            throw new RuntimeException("The price: "+ price+ " you entered is Invalid price");
        }
    }

    public void calling(long phoneNumber){
        System.out.println("Iphone is calling " + phoneNumber);

    }

    public void calling(long num1, long num2){
        calling(num1);
        calling(num2);
    }

    public void texting(long phoneNumber){
        System.out.println("Iphone is texting " + phoneNumber);

    }

    public void texting(long num1, long num2){
        texting(num1);
        texting(num2);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Iphone is making a faceTime with " + phoneNumber);
    }

    public void faceTime(long num1, long num2){
        faceTime(num1);
        faceTime(num2);
        System.out.println("Iphone is making faceTime calls with " + num1 + " and " + num2);
    }



    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
