package BankAccountSimpleProject;

import com.sun.imageio.plugins.jpeg.JPEGImageReaderResources;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;
    Scanner Money=new Scanner(System.in);
    private double DepositMoney;
    private double WithDrawMoney;




    public Account(String Number,double Balance,String Name,String Email,String PhoneNumber){
        this.Number=Number;
        this.Balance=Balance;
        this.Name=Name;
        this.Email=Email;
        this.PhoneNumber=PhoneNumber;
    }

     public void Deposit(double DepositMoney){

         this.Balance+=DepositMoney;
         System.out.println("Deposit is Successfully, current AccountMoney is "+this.Balance);

     }
     public void WithDrawDeposit(double WithDrawMoney){

        if(this.Balance-WithDrawMoney<0){
            System.out.println("WithDraw unsuccessfully Only is "+this.Balance+" is Current Balance");
        }else{
            this.Balance-=WithDrawMoney;
            System.out.println("WithDrew is Successfully, Current Balance is "+this.Balance);
        }
     }


    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
