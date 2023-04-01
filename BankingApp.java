package miniproject;

import java.util.Scanner;
class Bank 
{  
    String accno;  
    String name;
    long balance;
    String account_holder_name;
    String account_Number;
    Scanner sc = new Scanner(System.in);
    
    //Parameterized Constructor.
    public Bank(String aname,String anumber)//aname stands for account holder name And anumber stands for account number.
    {
    	this.account_holder_name=aname;
		this.account_Number=anumber;   	
    }
    
    //Check Balance
    public void check_balance() 
    {
    	System.out.println("Your Balance is Rs."+balance+".");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
	}
    
    //Deposit Money  
    public void deposit() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;
        System.out.println("Dear "+account_holder_name+", RS."+amt+" is Credited on your account "+account_Number+" Successfully.");
        System.out.println("Your account balance is Rs."+balance+".");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }
    
    //Withdraw Money  
    public void withdrawal() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) 
        {  
            balance = balance - amt;
            System.out.println("Rs."+amt+" was debited from your account "+account_Number+".");
            System.out.println("Your Available Balance is: Rs." + balance+".");  
        } 
        else 
        {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" ); 
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
        }
    }
    
    //Exit Method.
    void exit()
    {
        System.out.println("Dear "+account_holder_name+"\nThank You For Visting Us!! \nSee You Soon...");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }
    
    void show() 
    {
        System.out.println("***BANKING APPLICATION SYSTEM***");
    	System.out.println("Welcome "+account_holder_name);
		System.out.println("Your Account number is "+account_Number);
    }
}

public class BankingApp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		Bank b=new Bank("MINAL GANGARAM PATIL","SBI202000");
		b.show();
        int ch;  
        do 
        {  
            System.out.println("\nEnter Your Choice: ");
            System.out.println("=====================================");
            System.out.println(" 1. Check Balance  \n 2. Deposit the Amount \n 3. Withdraw the Amount \n 4. Exit ");
            ch = sc.nextInt();  
                switch (ch) 
                {  
                    case 1:  
                       b.check_balance();
                        break;  
                    case 2: 
                    	b.deposit();
                        break;            
                    case 3:  
                        b.withdrawal();
                        break;  
                    case 4: 
                    	b.exit();
                        break;  
                }  
          }  
            while (ch != 4);  
	}
}