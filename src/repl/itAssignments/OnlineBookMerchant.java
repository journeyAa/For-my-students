package repl.itAssignments;

public class OnlineBookMerchant {
    public static void main(String[] args) {
        int freeBooks = 0;
        boolean isPremiumCustomer = true;
        int nbooksPurchased = 9;



        if(isPremiumCustomer){
            if(nbooksPurchased>=5){
                freeBooks=1;
            }
            if(nbooksPurchased>=8){
                freeBooks=2;
            }

        }else{
            if(nbooksPurchased>=7){
                freeBooks+=1;
            }if(nbooksPurchased>=12){
                freeBooks+=2;
            }

        }
        System.out.println(freeBooks);

        for (int i = 0; i <3 ; i++) {
            for (int j = i; j >= 0 ; j--) {

                System.out.print("*");
            }

            System.out.println();
        }













    }
}
