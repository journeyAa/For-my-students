package day51_Exceptions;

/*same method name, same parameter, same return type
Must happen in Sub class
@Override must be applicable (for checking)
Access modifier must be same or more visible
Constructor and static methods can NOT be overridden (Only instance method can be overridden)
        can not be Final
* */
class A{
   public void method(){

   }

   public A(){

   }
}




public class MethodOverriding extends A {
   @Override
    public void method(){

    }
  //  public A(){
 //
  //  }
    @Override
    public String toString(){
        return "example";
    }
}
