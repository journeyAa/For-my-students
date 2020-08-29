package day46_ConstructorCalls;

public class Quiz {
   String name;
   int age;

   public void setInfor(String name, int age){
       name = name;
       age = age;
   }

    public static void main(String[] args) {
Quiz onj1 = new Quiz();
onj1.setInfor("Lucy", 4);
        System.out.println(onj1.name + onj1.age);
    }

}
