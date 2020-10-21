package Practice.Practice_Constructor.day42;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server[] servers = {new Server(), new Server(), new Server()};
        servers[0].setInfo("Ali", 111, 12.5, true);
        servers[1].setInfo("Gul", 123, 13.5, true);
        servers[2].setInfo("Nihan", 145, 10.50, false);

        Chef[] chefs = {new Chef(), new Chef(), new Chef()};
        chefs[0].setInfo("Samir", 101, 30.50, true);
        chefs[1].setInfo("Babil", 150, 40.50, true);
        chefs[2].setInfo("Nadir", 101, 15.50, false);

        Restaurant restaurant = new Restaurant();
        restaurant.setInfo("Haji", "Urumqi", 4);
        restaurant.hireChef("Adil", 114, 15, false);
        restaurant.hireChefs(chefs);
        restaurant.hireServer(servers);

        System.out.println(restaurant);





















    }
}
