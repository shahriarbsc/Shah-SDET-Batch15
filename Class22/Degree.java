package Class22;

public class Degree {

    void getPrerequisite() {
        System.out.println("To a get a Degree You need high school diploma");
    }

}

class Bachelors extends Degree {

}

class Masters extends Degree {

    void getPrerequisite() {
        System.out.println("To a get a Masters Degree we need a Bachelors Degree first");
    }
}

class DegreeTester {

    public static void main(String[] args) {

        Degree degree = new Degree();
        degree.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
        Masters masters = new Masters();
        masters.getPrerequisite();

    }
}