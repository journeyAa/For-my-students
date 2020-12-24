package Practice.pracice_Inheritance.day51;

public class SuperKeyword3 {
    public static void main(String[] args) {

    }

    class X{
        public X(){
            System.out.println("X");
        }
    }

    class Y extends X{
        public Y(){
         //   super(); //XY
            System.out.println("Y");
        }
    }

    class Z extends Y{
        public Z(){
         //   super();
            System.out.println("Z");
        }
    }





}
