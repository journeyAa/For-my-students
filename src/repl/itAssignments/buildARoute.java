package repl.itAssignments;

public class buildARoute {
    public static void main(String[] args) {

        String start = "A";
        String end = "C";
        String route ="";

        switch (start){
            case"A":
                switch (end){
                    case"A":
                        route+="A found";
                        break;
                    case "B":
                        route+="right: B found";
                        break;
                    case "C":
                        route+="right > down: C found";
                        break;
                    case "D":
                        route+="right > down > left: D found";
                        break;
                }
                break;
            case "B":
                switch (end){
                    case "A":
                        route+="down > left > up: A found";
                        break;
                    case "B":
                        route+="B found";
                        break;
                    case "C":
                        route+="down: C found";
                        break;
                    case "D":
                        route+="down > left: D found";
                        break;
                }
                break;
            case "C":
                switch (end){
                    case "A":
                        route+="left > up: A found";
                        break;
                    case "B":
                        route+="left > up > right: B found";
                        break;
                    case "C":
                        route+="C found";
                        break;
                    case "D":
                        route+="left: D found";
                        break;
                }
                break;
            case "D":
                switch (end){
                    case "A":
                        route+="up: A found";
                        break;
                    case "B":
                        route+="up > right: B found";
                        break;
                    case "C":
                        route+="up > right > down: C found";
                        break;
                    case "D":
                        route+="D found";
                        break;
                }
                break;
        }
        System.out.println(route);



    }
}
