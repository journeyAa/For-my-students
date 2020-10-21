package Practice.Practice_Constructor.day42;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    String owner;
    String location;
    int numberOfStars;
   ArrayList<Server> servers = new ArrayList<>();
   ArrayList<Chef> chefs = new ArrayList<>();

   public void setInfo(String owner, String location, int numberOfStars){
       this.owner=owner;
       this.location=location;
       this.numberOfStars=numberOfStars;
   }

   public void hireServer(Server server){
       this.servers.add(server);
   }

   public void hireServer(Server[] servers){
       this.servers.addAll(Arrays.asList(servers));
   }

   public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime){
       Server server = new Server();
       server.setInfo(name, employeeID, hourlyRate, true);
       servers.add(server);
   }

   public void hireChef(Chef chef){
       chefs.add(chef);
   }

   public void hireChefs(Chef[] chefs){
       this.chefs.addAll(Arrays.asList(chefs));
   }

   public void hireChef(String name, int employeeID, double hourlyRate, boolean fullTime){

   }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                ", total chefs =" + chefs.size() +
                ", total servers=" + servers.size()+

                '}';
    }

    public void terminateEmployee(String title, int employeeID){
       if(!(title.equals(chefs)||title.equals(servers))){
           System.out.println("invalid employee type");
           return;
       }
       chefs.removeIf(p->p.employeeID==001);
        System.out.println();
       servers.removeIf(p->p.employeeID==005);

    }
}
