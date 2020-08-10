package day25_Practices_Arrays;

public class ShortestString {
    public static void main(String[] args) {
        String[] arr = {"Adam", "Nicolas", "Demi", "Nurmememt"};
        int minLength = arr[0].length();// will contain the min length

        for (int i = 0; i < arr.length-1; i++) {  // this loop here is only for finding out the min length of the string in the array
            int l = arr[i].length();  // 4, 8, 4,
            if(l < minLength){
                minLength = l;
            }
        }
        System.out.println(minLength);
        System.out.println();
        for (int i = 0; i < arr.length-1; i++) {// to see how many string matching with the min length
            if(arr[i].length()==minLength){
                System.out.println(arr[i]);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
