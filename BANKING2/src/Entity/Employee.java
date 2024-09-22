package Entity;

public class Employee {
    public int id;
    public String name;
    public int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter cho id
    public int getId() {
        return id;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho salary
    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double percent){
        this.salary += (this.salary * percent / 100);
    }

    public int getAnnualSalary(){
        return this.salary * 12;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }



}
