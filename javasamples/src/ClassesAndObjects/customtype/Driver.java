package ClassesAndObjects.customtype;

public class Driver {
    public static void main(String[] args) {
        Dept d = new Dept(10, "IT", "SG");
        Emp e = new Emp(101, "Sara", 555, d);

        System.out.println(
                        e.eid + " - " 
                        + e.ename +" - " 
                        + e.sal +" - " 
                        + e.department.did +" - " 
                        + e.department.dname +" - " 
                        + e.department.loc
                    );
    
}
}
