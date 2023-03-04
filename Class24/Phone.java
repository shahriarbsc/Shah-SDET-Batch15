package Class24;
public abstract class Phone {

    /*
    1.Create a phone class lets create abstract methods like displayPictures
    unlockPhone
    SendText
    2.child classes Iphone Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism
    */

  abstract void unlockPhone();
    abstract void SendText();
    abstract void displayPicture();

}
class Iphone extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("FacEid to unlock the Phone");

    }
    @Override
    void SendText() {

        System.out.println("Lets use the IMessage to send the text");

    }

    @Override
    void displayPicture() {
        System.out.println("Iphotos to browse the pictures");

    }
}

class Samsung extends Phone{

    @Override
    void unlockPhone() {

        System.out.println("Using fingerPrint sensor or camera");

    }
    @Override
    void SendText() {

        System.out.println("Messages app to send the message");

    }
    @Override
    void displayPicture() {
        System.out.println("Galary app to browse send the photos ");


    }
}