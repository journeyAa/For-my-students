package Practice.Practice_CustomMethods;

public class Void_Method {
    public static void main(String[] args) {
      oddNum();
      evenNum();
      age(1986, 2020);
      toVote("Alper", 37, false, "Trump");
      toVote("Nafi", 26, true, "Trump");
      toBuyliqor(36, true);
      toBuyliqor(18, false);

      calculator(10,'%', 3);
      calculator(10, '*', 3);
      calculator(10, '/', 3);
      calculator(10, '+', 3);
      calculator(10, '-', 3);

      grade(100);
      grade(150);
      grade(20);
      grade(75);

      String s = "Alper Bryan";
      reverseStr(s);

        String str = "aabbccdfgg";
        unique(str);

        String str1 = "Kayak";
        String s1 = "Alper";

        palindrome(str1);
        palindrome(s1);

        String str2 = "aabbcc";
        removeDup(str2);

        int[] arr1 = {100,50,96,22,-86};
        max(arr1);
        min(arr1);

    }
    //  1. create a method that can print odd numbers between 1~100 in a same line
    //  separated by space
    public static void oddNum(){
        for (int i = 1; i <= 100 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println();
    }

    // 2. create a method that can print even numbers between 1~100
    public static void evenNum(){
        for (int i = 1; i <= 100 ; i++) {
            if(i%2==0){
                System.out.print(i + " ");
            }

        }
        System.out.println();

    }

    // 3. create a method that can calculate the age of the person
    public static void age(int bornYear, int currentYear){
        int age = currentYear - bornYear;
        System.out.println("You are " + age + " year old.");


    }

     // 4. check eligibility to vote
    public static void toVote(String name, int age, boolean usCitizen, String candidate){
        boolean eligibleToVote = age >= 18 && usCitizen == true;
        if(eligibleToVote){
            System.out.println(name + " is eligible to vote for " + candidate);
        }else{
            System.out.println(name + " is NOT eligible to vote for " + candidate);
        }




    }

    //5. check eligibility to buy alcohol
    public static void toBuyliqor(int age, boolean hadId){
        if(age >= 21 && hadId){
            System.out.println("You can get alcohol but only before 11 pm.");
        }else{
            System.out.println("You'd better get some milk instead");
        }



    }

    //  5.1 create a method that can calculate two numbers: num1,  operator, num2
    public static void calculator(int num1, char operator, int num2){
        if(operator == '+'){
            System.out.println("addition " + (num1 + num2));
        }else if(operator == '-'){
            System.out.println("subtraction " + (num1 - num2));
        }else if(operator == '*'){
            System.out.println("multiplication " + (num1 * num2));
        }else if(operator == '/'){
            System.out.println("division " + (num1/num2));
        }else if(operator == '%'){
            System.out.println("remainder " + (num1 % num2));
        }

    }

    //6. calculate the grade of the student based on the score
    public static void grade(int score){
        if(score<0 || score>100){
            System.out.println("Invalid score");
            return;
        }
        char grade = 'A';
        if(score>=90){
            grade = 'A';
        }else if(score>=80){
            grade = 'B';
        }else if(score>=70){
            grade = 'C';
        }else if(score>=60){
            grade = 'D';
        }else{
            grade ='F';
        }

        System.out.println("Your grade is " + grade);

    }

     //   7. create a method that can reverse any String
    public static void reverseStr (String str){
        String reverseStr = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            String each ="" + str.charAt(i);
            reverseStr += each;
        }
        System.out.println(reverseStr);



    }

    //  8. write a method that can print out the unique elements from an array of string
    public static void unique (String str){
        String result = "";
        for (int i = 0; i <= str.length()-1 ; i++) {
            String each = ""+ str.charAt(i); // retrieving each char
            int count = 0;

            for (int j = 0; j <= str.length()-1 ; j++) {
                String every = "" + str.charAt(j);
                if(each.equals(every)){
                    count++;
                }

            }
            if(count==1){
                result+=each;
            }

        }
        System.out.println(result);














    }


    //  9. write a method that can check if a string is palindrome print true if it's  otherwise print false
    public static void palindrome(String word){
        String reverse = "";
        for (int i = word.length()-1 ; i>=0 ; i--) {
            reverse+=word.charAt(i);
        }
        System.out.println(reverse.equalsIgnoreCase(word));


    }

    // 10. write a method that can remeove the duplicates from the string
    //            "abababa"
    //            "ab"
    public static void removeDup(String str){
        String nonDup = "";
        for (int i = 0; i <= str.length()-1 ; i++) {
            String s = "" +  str.charAt(i); // retrieving each character a b a b ..
            if(nonDup.contains(s)){
                continue;
            }
            nonDup+=s;

        }
        System.out.println(nonDup);

    }

    //  11. write a method that can print out the maximum number from any array of integers
    public static void max(int[] arr){
        int max = arr[0];
        for (int each: arr){  // taking out all elements , 2,5,7,
            if(each>max){
                max = each;
            }
        }
        System.out.println("the maximum num in this array is " + max);


    }

    // 12. write a method that can print out the minimum number from any array of integers
    public static void min(int[] arr){
        int min = arr[0];
        for (int each: arr){
            if(each < min){
                min=each;
            }
        }
        System.out.println("The min num in this array is " + min);
    }



























}
