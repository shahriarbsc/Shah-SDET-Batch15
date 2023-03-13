package Class24;


    //Create a webdriver interface that will have the following unimplemented behaviour: openBrowser()
//closeBrowser(), maximizeWindow(), fineElements implements webDriver interface: ChromeDriver and Firefox Driver

import Class23.WebDriver;

public interface Class24HW1WebDriver {

            void openBrowser();

            void closeBrowser();
            void maximizeWindow();
            void findElement();
        }
        class ChromeDriver implements Class24HW1WebDriver {

            @Override
            public void openBrowser() {
                System.out.println("You can open Chrome Browser");
            }

            @Override
            public void closeBrowser() {
                System.out.println("You can close Chrome Browser");
            }

            @Override
            public void maximizeWindow() {
                System.out.println("You can maximize the window on Chrome Browser");
            }

            @Override
            public void findElement() {
                System.out.println("You can find the element in Chrome Browser");
            }
            class FirefoxDriver implements Class24HW1WebDriver{
                @Override
                public void openBrowser() {
                    System.out.println("You can open Firefox Browser");
                }

                @Override
                public void closeBrowser() {
                    System.out.println("You can close Firefox Browser");
                }

                @Override
                public void maximizeWindow() {
                    System.out.println("You can maximize the window on Firefox Browser");
                }

                @Override
                public void findElement() {
                    System.out.println("You can find the element in Firefox Browser");
                }
            }
        }

