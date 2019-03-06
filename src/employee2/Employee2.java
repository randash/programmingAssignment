package employee2;
public class Employee2 {
private String name;
private String department;
private double salary;
public static int count=0;

    public Employee2(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(int bouns) {
        this.salary += salary*bouns/100;
    }

    public static int getCount() {
        return count;
    }

    public Employee2() {
    }
    
    
    
}
