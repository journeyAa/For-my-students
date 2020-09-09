package day51_Exceptions.BrowsersTask;

public class BrowserObjects {
    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://google.com");
        chrome.close();
        System.out.println("==========================================================");

        FireFoxBrowser fireFox = new FireFoxBrowser();
        fireFox.get("https://google.com");
        fireFox.close();
        System.out.println("==============================================================");

        OperaBrowser operaBrowser = new OperaBrowser();
        operaBrowser.get("https://google.com");
        operaBrowser.close();
        System.out.println("=================================================================");



    }
}
