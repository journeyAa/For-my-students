package Practice.Practice_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(105000, "VA", true, true, true, "SDET", true);
        offer2.setOfferInfo(175_000,"VA",true,true, false, "SDET", true);
        offer3.setOfferInfo(125000,"VA", true, true, true, "SDET", true);
        offer4.setOfferInfo(130_000,"PA",true,false, false, "QA", true);
        offer5.setOfferInfo(100_000,"CA",true,false, false, "QA", true);
        offer6.setOfferInfo(120000,"CO",true,true,true,"Senior SDET",true);
        offer7.setOfferInfo(110_000,"GA",true,false, false, "QA", true);

        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        for (Offer each: jobOffers){
            each.getOfferInfo();
        }

      // jobOffers.removeIf(p-> p.salary<120000 || !p.state.equalsIgnoreCase("VA"));

      //  System.out.println(jobOffers.size());

        jobOffers.removeIf(each-> each.hasPO==false || each.hasBenefit==false || each.isFullTime==false);
        System.out.println(jobOffers.size());







    }
}
