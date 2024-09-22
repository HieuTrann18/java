package bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Nap tien thanh cong: " + amount);
        }else{
            System.out.println("So tien phai lon hon 0");
        }
    }

    public void displayBalance(){
        System.out.println("So du hien tai: " + balance);
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount; // balance = balance - amount
            System.out.println("Rut tien thanh cong: " + amount);
        }else{
            System.out.println("So tien rut khong hop le");
        }
    }
}
