package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str = "We study java not python";
        str = str.toLowerCase();
        int count = 0;
        /*
        if(str.contains("cat")){  // 1st time, it is true;
            count+=1;// so count is 1, and str is "cat"
            str = str.replaceFirst("cat", "");

        }
        System.out.println(str);

        if(str.contains("cat")){
            count++;
            str = str.replace("cat", "");
        }
        System.out.println(count);

         */

// this is for count of dog
        while (str.contains("java")){
            count++;
            str = str.replaceFirst("java", "");
        }
        System.out.println(count);
        System.out.println();

        // we can make another loop for the count of cat
        int countOfCat = 0;
        while (str.contains("python")){
            countOfCat++;
            str = str.replaceFirst("python", "");
        }
        System.out.println(countOfCat);

        System.out.println(count==countOfCat);


















    }
}
