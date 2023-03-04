package HomeWorkFeb262023;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        /*
        3)Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
        John Smith=$100000
         */

        Map<String, Integer> employeeSalary = new HashMap<>();
        employeeSalary.put("John Smith",100000);
        employeeSalary.put("Jason Michael",150000);
        employeeSalary.put("Paula Henry",250000);
        employeeSalary.put("Fady Mark",300000);

        String highestSalaryEmployee = "";
        int highestSalary = 0;
        for (Map.Entry<String, Integer> entry : employeeSalary.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestSalaryEmployee = entry.getKey();
            }
        }


        System.out.println(highestSalaryEmployee + "=$" + highestSalary);
    }
}
