package Employee2;
public class Employee {
    String fName;
    String lName;
    double salary;
    Employee(String fName, String lName, double salary){
        this.fName=fName;
        this.lName=lName;
        this.salary=salary;
    }
    void setfName(String fName){
        this.fName=fName;
    }
    void setlName(String lName){
        this.lName=lName;
    }
    void setSalary(double salary){
        if(salary>0){
        this.salary=salary;
        }
    }
    String getfName(){
    return this.fName;
    }
    String getlName(){
    return this.lName;
    }
    double getYearlySalary(){
    return this.salary*12;
    }
}
