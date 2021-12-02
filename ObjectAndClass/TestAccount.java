class Account{
    int acc_no;
    String name;
    float amount;

    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }

    void deposit(float amt)
    {
        amount=amount+amt;
        System.out.println(amt+"deposit");
    }

    void withdraw(float amt)
    {
        if(amount<amt)
        {
            System.out.println("insufficient balance");
        }else{
            amount=amount-amt;
            System.out.println(amt+"withdraw");
        }
    }

    void checkBalance(){
        System.out.println(amount+"Balance");
    }

    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}
public class TestAccount {
    public static void main(String args[])
    {
        Account a1=new Account();
        a1.insert(8439233,"sumthi",5000);
        a1.display();
        a1.checkBalance();
        a1.deposit(4000);
        a1.checkBalance();
        a1.withdraw(2000);
        a1.checkBalance();
    }
}
