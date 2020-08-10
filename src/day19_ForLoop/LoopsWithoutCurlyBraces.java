package day19_ForLoop;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        int k = 0;

        for(k = 1; k <= 49; k++){
            System.out.print("#");
        }
        System.out.println();

        for(int i = 11; i <= 121; i++){
            if(i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        for(int i = 11; i <= 121; i += 2){
            System.out.print(i + " ");
        }





















    }
}
