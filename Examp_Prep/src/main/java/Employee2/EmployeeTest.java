package Employee2;
public class EmployeeTest {
    public static void main(String [] args){
        Employee e1=new Employee("AB","Tuku", 5000);
        Employee e2=new Employee("Sakina","Mam", 10000);
        System.out.println("Yearly Salary of e1: "+e1.getYearlySalary());
        System.out.println("Yearly Salary of e1: "+e2.getYearlySalary());
        e1.setSalary(e1.salary+(e1.salary*0.1));
        System.out.println("Salary of e1 after inc: "+e1.getYearlySalary());
        e2.setSalary(e2.salary+(e2.salary*0.1));
        System.out.println("Salary of e1 after inc: "+e2.getYearlySalary());

    }
}
