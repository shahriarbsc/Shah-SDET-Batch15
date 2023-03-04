package Class24;
public class ComputerHW{

    public void turnOn() {
        System.out.println("Computer turns on");
    }

    public void turnOff() {
        System.out.println("Computer turns off");
    }

    public void restart() {
        System.out.println("Computer restarts");
    }
}

class Apple1 extends ComputerHW {
    @Override
    public void turnOn() {
        System.out.println("Apple iMac turns on");
    }

    @Override
    public void turnOff() {
        System.out.println("Apple iMac turns off");
    }

    @Override
    public void restart() {
        System.out.println("Apple iMac restarts");
    }

    public void browser () {
        System.out.println("Apple users use Safari as their default browser");
    }
}

class Lenovo1 extends ComputerHW {
    @Override
    public void turnOn() {
        System.out.println("Lenovo turns on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lenovo turns off");
    }

    @Override
    public void restart() {
        System.out.println("Lenovo restarts");
    }

    public void playMusic () {
        System.out.println("Lenovo users use it to listen to music");
    }
}

class HP1 extends ComputerHW {
    @Override
    public void turnOn() {
        System.out.println("HP turns on");
    }

    @Override
    public void turnOff() {
        System.out.println("HP turns off");
    }

    @Override
    public void restart() {
        System.out.println("HP computer restarts");
    }

    public void playGames() {
        System.out.println("HP computer users use it to play video games");
    }
}

class Dell1 extends ComputerHW {

    public void turnOn() {
        System.out.println("Dell computer turns on");
    }


    public void turnOff() {
        System.out.println("Dell computer turns off");
    }


    public void restart() {
        System.out.println("Dell computer restarts");
    }

    public void watchMovies() {
        System.out.println("Dell computer users use it to watch movies");
    }
}

