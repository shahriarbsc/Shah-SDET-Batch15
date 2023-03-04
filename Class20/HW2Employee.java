package Class20;
public class HW2Employee {

    String name;
    int experience;
    int point;

    HW2Employee(String name, int experience, int point){
        this.name=name;
        this.experience=experience;
        this.point=point;
    }

    void works(){
        System.out.println(name+ " works "+experience+" years here ");
    }
    void earns(){
        System.out.println(name+ " will earn "+point+" points after webinars");
    }
}

class FullTime extends HW2Employee{

    String ID;
    int workTime;
    FullTime(String name, int experience, int point, String ID, int workTime) {
        super(name, experience, point);
        this.ID = ID;
        this.workTime = workTime;
    }
    void have(){
        System.out.println(super.name+"'s ID number is "+ID+", and works "+workTime+" hours per day");
    }
}

class PartTime extends HW2Employee{
    int workTime;
    PartTime(String name, int experience, int point, int workTime){
        super(name, experience, point);
        this.workTime=workTime;
    }
    void have1(){
        System.out.println(super.name+ " works "+workTime+" hours per day");
    }
}

class FullTimeEmp{

    FullTimeEmp() {
        super();
    }

    public static void main(String[] args) {
        FullTime emp = new FullTime("Shah", 4, 200, "1234AA", 9);
        emp.have();

    }
}
class PartTimeEpm {
    PartTimeEpm (){

        super();
    }

    public static void main(String[] args) {
        PartTime emp=new PartTime("Shupa", 1,200,8);
        emp.have1();

    }
}