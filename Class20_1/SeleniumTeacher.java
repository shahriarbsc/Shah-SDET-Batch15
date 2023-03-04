package Class20_1;

import Class20.TeacherHW;

public class SeleniumTeacher extends TeacherHW {

    public static void main(String[] args) {

        SeleniumTeacher selenium = new SeleniumTeacher();
        selenium.homework(); // public
        selenium.grade(); // protected available through inheritance
        //selenium.scholarship(); // default not available


    }


}
