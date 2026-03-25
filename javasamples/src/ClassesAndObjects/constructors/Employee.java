package ClassesAndObjects.constructors;

public class Employee {
    String name;
    int age;
    float salary;
    String dept;

    // Constructors
    // the name of a constructor will be the same as Class Name
    // constructors help to create objects / instances
    public Employee(String name, int age, float salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public Employee() {
    }

    

    
// default constructor is implicitly present
// when a constructor is defined in the class, the default constructor is no more implicitly present.
// can add as many constructors as needed
// this keyword is used to refer to the current object's varable.
    

}
