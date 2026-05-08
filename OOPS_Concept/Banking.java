import java.util.Scanner;
class Account {
    // data security
    private double balance;

    public double showbalance(){
        this.balance=balance;
        return balance;
    }
    // method:public
    public double getBalance(double balance) {
        //authentication
        boolean result= validate("sachin", "1234");
        // withraw the money
        if(result){
            this.balance-=balance;
            System.out.println("withraw successful");
        }
        else{
            System.out.println("invalid username or password");
        }
        return balance;
    
    }

    public void setBalance(double balance) {
        //perform authentication
        boolean result= validate("sachin", "1234");
        // depositing the money after authentication
        if(result==true){
            //deposit the money
            this.balance=this.balance+balance;
            System.out.println("credit to account");
        }
        else{
            //throw a meaningful message to the user
            System.out.println("wrong username or password");
        }
        
    }
    //method ::  private
    private boolean validate(String username, String password) {
        // logic of authentication
        return username.equalsIgnoreCase("sachin") && password.equalsIgnoreCase("1234") ? true : false;
    }

}

public class Banking {
    public static void main(String[] args) {
        Account acc=new Account();
        Scanner sc=new Scanner(System.in);
        System.out.println("for setBalance choose 1\nfor getBalance choose 2");
        int option=sc.nextInt();
        if(option==1){
            System.out.print("tell the amount to want to set:- ");
            double amount=sc.nextDouble();
            acc.setBalance(amount);
            double currentBalance=acc.showbalance();
            System.out.println("current balance = " + currentBalance);
        }
        else if(option ==2){
            System.out.print("tell the amount to want to withdraw:- ");
            double amount=sc.nextDouble();
            acc.getBalance(amount);
            double currentBalance=acc.showbalance();
            System.out.println("current balance = " + currentBalance);
        }

    }
}
