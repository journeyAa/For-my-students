package day51_Exceptions.BrowsersTask;

public class ChromeBrowser extends WebDriver {
    // inherited get, close methods as it is

    @Override
    public void get(String url){
        System.out.println("Opening the: " + url+ " in chrome browser");

    }

    public void close(){
        System.out.println("Closing the chrome browser");
    }
}
