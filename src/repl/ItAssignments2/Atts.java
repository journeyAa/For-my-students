package repl.ItAssignments2;

public class Atts {

    String name;
    String color;
    int amount;

    public void a(String name, String color, int amount){
        this.name = name;
        this.color = color;
        this.amount = amount;

    }

    public String asString(){
        return "name: " + name + " color: " + color + " amount: " + amount;
    }




}
