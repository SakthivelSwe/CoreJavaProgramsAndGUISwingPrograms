package BankAccountSimpleProject;

public class main {
    public static void main(String[] args){
        Account sakthiAccount=new Account("12345",0.0,"Sakthivel","arun@gmail.com","9080086413");

        sakthiAccount.Deposit(500);
        sakthiAccount.WithDrawDeposit(600);
        sakthiAccount.WithDrawDeposit(200);

    }
}
