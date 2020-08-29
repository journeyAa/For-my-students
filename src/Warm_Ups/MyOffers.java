package Warm_Ups;

import java.util.ArrayList;
import java.util.Arrays;

/*
 create a class called MyOffers
            Create 5 offer objects
                1. use for loop to print out the info of each offer
                2. write a program that can only retain the offers if:
                        1. the offer is for fulltime position
                        2. offer is from your local area
                        3. salary is greater than 100K

 */
public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer("Kitchener", "Google", 145000, true);
        Offer offer2 = new Offer("Toronto", "Amazon", 80000, false);
        Offer offer3 = new Offer("Toronto", "TD Bank", 150000, true);
        Offer offer4 = new Offer("Vancouver", "Dev Facto", 165000, true);
        Offer offer5 = new Offer("Ottawa", "Royal Bank of Canada", 155000, true);

       ArrayList<Offer> offers = new ArrayList<>();
       offers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        System.out.println(offers);

        offers.removeIf(p->p.isFullTime==false);
        System.out.println(offers.size());

        offers.removeIf(p->p.location!="Toronto");
        System.out.println(offers.size());




    }
}
