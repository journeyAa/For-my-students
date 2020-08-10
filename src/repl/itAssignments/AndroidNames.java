package repl.itAssignments;

public class AndroidNames {

    public static void main(String[] args) {

        double version = 8;
        String print = "";

        if(version == 1.5){
            print = "Cupcake";
        }else if(version == 1.6){
            print = "Donut";
        }else if(version == 2.1){
            print = "Eclair";
        }else if(version == 2.2){
            print = "Froyo";
        }else if(version == 2.3){
            print = "Gingerbread";
        }else if(version == 3.1){
            print = "Honeycomb";
        }else if(version == 4.0){
            print = "Ice Cream Sandwich";
        }else if(version >= 4.1 && version <= 4.31){
            print = "Jelly Bean";
        }else if(version >= 4.4 && version <= 4.44){
            print = "KitKat";
        }else if(version >= 5 && version <= 5.11){
            print = "Lollipop";
        }else if(version >= 8 && version <= 8.1){
            print = "Oreo";
        }else if(version == 9){
            print = "Pie";
        }else{
           print = "Sorry, I don't know this version!" ;
        }

        System.out.println(print);





    }


}
