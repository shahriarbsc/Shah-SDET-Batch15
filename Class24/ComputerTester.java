package Class24;
public class ComputerTester {

        public static void main(String[] args) {

            ComputerHW[] computers = {new Apple1(), new Lenovo1(), new HP1(), new Dell1()};
            for (ComputerHW computer: computers) {
                computer.turnOn();
                computer.turnOff();
                computer.restart();

                if (computer instanceof Apple1) {
                    Apple1 apple=(Apple1)computer;
                    apple.browser();
                }

            }
        }
    }



