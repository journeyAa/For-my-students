package repl.itAssignments;

public class HTML {
    public static void main(String[] args) {

        String html = "<abc>invalid</abc>";
        if(!html.contains("html")){
            System.out.println("Invalid input!");
        }else{

            int idI = html.indexOf("id");
            int hashcode = html.lastIndexOf("\"");
            String myId = html.substring(idI+4, hashcode);

            System.out.println(myId);
        }
























    }
}
