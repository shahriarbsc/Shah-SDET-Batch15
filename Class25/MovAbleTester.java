package Class25;

public class MovAbleTester {
    public static void main(String[] args) {


     WashAble[] washAbles ={new SmartWatch(),new Inverter()};
     new Inverter(); new Phone();


         for(WashAble w:washAbles){
             w.wash();
         }
    }
    }

