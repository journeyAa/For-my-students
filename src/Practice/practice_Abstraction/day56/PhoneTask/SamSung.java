package Practice.practice_Abstraction.day56.PhoneTask;

public class SamSung extends Phone{

    public SamSung(String brand, String model, double price, String size){
        super("SamSung", model, price, size);
        if(price<= 0 || price> 1200){
            throw new RuntimeException("The price: "+ price+ " you entered is Invalid price");
        }
    }

    public void calling(long phoneNumber){
        System.out.println("SamSung is calling " + phoneNumber);

    }

    public void calling(long num1, long num2){
        calling(num1);
        calling(num2);
    }

    public void texting(long phoneNumber){
        System.out.println("SamSung is texting " + phoneNumber);

    }

    public void texting(long num1, long num2){
        texting(num1);
        texting(num2);
    }

    public void freezing(){
        System.out.println("SamSung is freezing again");
    }


    @Override
    public String toString() {
        return "SamSung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
