package Class20;

public class Sport {
    String name;
    String country;

    Sport(String name, String country) {
        this.name = name;
        this.country = country;

    }

    public void display() {

        System.out.println(name + " is played in " + country);
    }

}

class Cricket extends Sport {

    String helmet;

    Cricket(String name, String country, String helmet) {

        super(name, country); // makes a call to the immediate super class constructor
        //super () = ALWAYS must be on the first line
        this.helmet = helmet;

    }

}

class Soccer extends Sport {

    String team;

    int numbersOfPlayers;

    Soccer(String name, String country, String team, int numbersOfPlayers) {

        super(name, country);
        this.team = team;
        this.numbersOfPlayers=numbersOfPlayers;

    }

    void displayTeam(){
        System.out.println(team+" consist of "+numbersOfPlayers+" players");
    }



}