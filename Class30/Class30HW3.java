package Class30;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class30HW3 {
    public static void main(String[] args) {

        /*Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
         */

        Map<String, Integer> employeeSalaryMap = new HashMap<String, Integer>();

        employeeSalaryMap.put("John Smith", 100000);
        employeeSalaryMap.put("Shahriar Shah", 95000);
        employeeSalaryMap.put("James Bond", 130000);

        String highestSalaryEmployee = "";
        int highestSalary = 0;
        for (Map.Entry<String, Integer> entry : employeeSalaryMap.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalaryEmployee = entry.getKey();
                highestSalary = entry.getValue();
            }
        }
        System.out.println(highestSalaryEmployee + " =$ " + highestSalary);
    }


}

