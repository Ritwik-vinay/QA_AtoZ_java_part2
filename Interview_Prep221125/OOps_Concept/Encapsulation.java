package OOps_Concept;

import javax.naming.Name;

public class Encapsulation {
    //Encapsulation
    public String name ;
    public int Salary;

    public Encapsulation(String Name , int salary){
        this.name = Name ;
        this.Salary= salary;
    }
    public String getname(){
        return name;
    }
    public int getSalary(){
        return Salary;
    }
    public void setname(String Name ){
        this.name= Name;
    }
    public void setSalary(int salary){
        this.Salary=salary;
    }
    public  void displayDetails(){
        System.out.println("Employee Name is  "+ name);
        System.out.println("Salary is "+ Salary);
    }


    public static void main(String[] args) {
        Encapsulation ec = new Encapsulation("Ritwik" , 10000000);
        ec.displayDetails();
    }


}
