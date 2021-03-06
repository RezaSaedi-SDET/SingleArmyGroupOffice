package ReplitHw;

public class Employee {
    /*
    Question (146)
    Complete the Employee.java class:
    Include the following class variables:

    name(String)

    lastName(String)

    employeeId(int)

    startDate(String)

    salary(int)

    Write two constructors:

    non-argument constructor

    parameterized constructor that will initialize all instance variables

    Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.

    Output:

    null null 0 null 0
    Joe Smith 12345 01/01/1970 35000
     */

    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    Employee(String name, String lastName,int employeeId,String startDate, int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;

    }

    void employeeInfo(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }

    public static void main(String[] args) {
        Employee obj1=new Employee("null","null",0,"null",0);
        obj1.employeeInfo();
        Employee obj2=new Employee("Joe","Smith",12345,"01/01/1970",35000);
        obj2.employeeInfo();
    }
}
