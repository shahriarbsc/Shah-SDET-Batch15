package Class23;

public class WebDriverTester {
    public static void main(String[] args) {
/*
        WebDriver webDriver = new Safari();  // up casting primitive or non primitive

        //FireFox fireFox = new WebDriver(); down casting

        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();


        //  an Array of type parent class can hold the objects of all the child classes

        // Chrome chrome=new Chrome();
        //FireFox fireFox=new Firefox();
        //Safari safari = new Safari();
        WebDriver[] browsers={chrome,firefox,safari};

*/
        WebDriver[] browsers = {new Chrome(), new Safari(), new Firefox()};


        for (WebDriver browser : browsers) {

            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();

        }

    }
}

