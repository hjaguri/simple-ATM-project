import java.util.Scanner;

class ATM{
    Scanner sc=new Scanner(System.in);
    float balance;
    int pin=1111;
    public void checkPin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Pin");
        int enterPin=sc.nextInt();
        if(pin==enterPin){
    menu();
        }else{
            System.out.println("Enter the pin is vaild");
        }
    }

    private void menu() {
        System.out.println("Welcome to the bank");
        System.out.println("Enter the choice : ");
        System.out.println("1.Check Balance");
        System.out.println("2,Withdraw Balance");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        int option=sc.nextInt();
        switch (option){
            case 1: checkBalance();
                break;
            case 2: withdrawBalance();
                break;
            case 3: depositMoney();
                break;
            case 4: default:
                break;
        }
    }

    private void depositMoney() {
        System.out.println("Enter the amount for depositive : ");
        float depMoeny=sc.nextInt();
        balance=balance + depMoeny;
        System.out.println(depMoeny + " Rupees Depositive Sucessfully.");
        System.out.println("Total balance : " + balance);
        menu();
    }

    private void withdrawBalance() {
        System.out.println("Enter the amount : ");
        float withmoney= sc.nextInt();
        if(balance>=withmoney){
            System.out.println(withmoney + "Rupees withdraw successfully");
            balance=balance-withmoney;
            System.out.println("Total Balance : " + balance);
        }else{
            System.out.println("Money insufficient");
        }
        menu();
    }

    private void checkBalance() {
        System.out.println(balance);
        menu();
    }
}


public class Main {
    public static void main(String[] args) {
ATM atm=new ATM();
atm.checkPin();
    }
}

