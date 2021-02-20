class Employee{
    String name;
    String empId;
    double salary;
    
    public Employee(String name, String empId, double salary){
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmpId(String empId){
        this.empId = empId;
    }
    
    public void setSalary(String name){
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmpId(){
        return empId;
    }
    
    public double getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    String mgrType;
    
    public Manager(String mgrType){
        this.mgrType = mgrType; 
    }
    
    public void setSalary(){
        setSalary();
    }
}

class Clerk extends Employee{
    String qual;
    
    public Clerk(String qual){
        this.qual = qual;
    }
    
    public void setSalary(){
        setSalary();
    }
}

public class MyClass{
    public static void main(String[] args){
        Employee emp1 = new Employee("Raju","19P12",89000.0);
        Manager mng1 = new Manager()
    }
}

























