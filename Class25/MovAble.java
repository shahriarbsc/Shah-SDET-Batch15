package Class25;

public interface MovAble {


    public default void move() {


    }

    interface OwnAble {

        void own();

    }

    class Car implements MovAble, OwnAble {

        public void move() {

            System.out.println("I can move");
        }

        public void own() {

            System.out.println("You can own me");
        }


    }

    class Dog implements MovAble, OwnAble {


        public void move() {

            System.out.println("I can move");
        }

        public void own() {

            System.out.println("you can own me");
        }
    }
}