import java.util.Scanner;
import Entity.Employee;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import bank.BankAccount;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Employee[] employees = new Employee[3];
//
//        employees[0] = new Employee(1, "John", 5000);
//        employees[1] = new Employee(2, "Alice", 6000);
//        employees[2] = new Employee(3, "Bob", 7000);
//
//        System.out.println("List of employees");
//        for(Employee e : employees){
//            e.displayInfo();
//        }
//
//        Employee highestSalary = employees[0];
//
//        for(Employee emp :employees){
//            if(emp.getAnnualSalary() > highestSalary.getAnnualSalary()){
//                highestSalary = emp;
//            }
//        }
//        System.out.println("The Employee with the highest annual salary is: " );
//        highestSalary.displayInfo();

        BankAccount bank = new BankAccount("1812005868888", 1500000);

        bank.displayBalance();

        bank.deposit(100000);
        bank.displayBalance();

        bank.withdraw(600000);
        bank.displayBalance();




    }
     }

