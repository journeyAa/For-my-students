package Office_Hours.Practice_08_04_2020;

import Library.Util;

public class Gmail {
    public static void main(String[] args) {

         /*
            first Step:
                go to  :
                     https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                        Make sure that your google account allows third part app
 */


        // credentials
        String userName = "";
        String passWord = "";
        // email:
        String[] receivers = {};
        String subject = "";
        String text = "";
        int times = 5;
        int count  = 1;
        while(times > 0){ //send the email multiple time
            for( String each : receivers ){  // for sending emails to multiple people
                System.out.println("Sending to: "+each  );
              //  Util.sendEmails(userName,passWord,each, subject,text);
            }
            System.out.println(count++);
            times--;
        }
        System.out.println("Completed");

    }
}
