package ClassesAndObjects.constructors;

public class Employees {
    public static void main(String[] args) {
        // using the default constructor
        Employee emp = new Employee(); // calling the default constructor
       emp.name = "xx";
       emp.age = 34;
       emp.salary = 998.66f;
       emp.dept = "Sales";

        Employee[] employees = new Employee[6];
        // using the full loaded constructor
        employees[0]  = new Employee("John", 30, 8879.99f, "sales");
        employees[1]  = new Employee("Alex", 35, 8379.99f, "IT");
        employees[2]  = new Employee("Bill", 40, 3879.99f, "sales");
        // using Employee(String name, int age, String dept)
        employees[3] = new Employee("Sara", 34,"Admin");
        // using Employee(String name, int age, float salary)
        employees[4] = new Employee("Bill", 23, 5645.09f);
        // using Employee(String name)
        employees[4] = new Employee("Bill");


        for (Employee employee : employees) {
            System.out.print("\n"+ employee.name+ " - " + employee.age +" - ");
        }
        
    }
}


//  when a new keyword is used it calls a constructor
// 

