import java.util.Scanner;

 public class Account {
	
	private int customernumber;
	private int pinnumber;
	private double currentbalance = 0 ;
	private double savingbalance = 0;
	
	Scanner in=new Scanner(System.in);
	
	public int checkCustomerNumber(int customernumber) {
		this.customernumber=customernumber;
		return customernumber;
		
	}
  
	public int checkPinNumber(int pinnumber) {
		this.pinnumber=pinnumber;
		return pinnumber;
	}
	
    public int getCustomerNumber() {
    	return customernumber;
	}
    
    public int getPinNumber() {
    	return pinnumber;
	}
    
    public double goToCurrentBalance() {
    	return currentbalance;
    }
    
    public double goToSavingBalance() {
    	return savingbalance;
    }
	
	public void goToCurrentWithdraw() {
		System.out.println("Your current balance is: $" + currentbalance +"\n" );
		System.out.println("Enter the amount you want to withdraw:");
		calCurrentWithdraw();
		
	}

    public void goToCurrentDeposit() {
    	System.out.println("Your current balance is: $" + currentbalance +"\n" );
		System.out.println("Enter the amount you want to deposit:");
		calCurrentDeposit();
    	
    }
    

	public void goToSavingWithdraw() {
		System.out.println("Your saving balance is: $" + savingbalance +"\n");
		System.out.println("Enter the amount you want to withdraw:");
		calSavingWithdraw();
		
	}

    public void goToSavingDeposit() {
    	System.out.println("Your saving balance is: $" + savingbalance +"\n" );
		System.out.println("Enter the amount you want to deposit:");
		calSavingDeposit();
    	
    }
    
    public void calCurrentWithdraw() {
    	
    	double amount = in.nextDouble();
    	
    	if(currentbalance - amount >= 0 ) {
    		currentbalance = currentbalance - amount;
    		System.out.println("Withdraw Successfull!");
    		System.out.println("Your Current Balance is: $" + currentbalance +"\n");
    	}
    	else 
    		System.out.println("Not sufficient balance,Try with depositing some amount.Thank you");
    }
    
    public void calCurrentDeposit() {
    	double amount = in.nextDouble();
    	currentbalance = currentbalance + amount;
    	
    	System.out.println("Deposit Successfull!");
		System.out.println("Your Current Balance is: $" + currentbalance +"\n" );
    	
    }
    
    public void calSavingWithdraw() {
    	
    	double amount = in.nextDouble();
    	
    	if(savingbalance - amount >= 0 ) {
    		savingbalance = savingbalance - amount;
    		System.out.println("Withdraw Successfull!");
    		System.out.println("Your saving Balance is: $" + savingbalance +"\n" );
    	}
    	else 
    		System.out.println("Not sufficient balance,Try with depositing some amount.Thank you");
    }
    
    public void calSavingDeposit() {
    	double amount = in.nextDouble();
    	savingbalance = savingbalance + amount;
    	
    	System.out.println("Deposit Successfull!");
		System.out.println("Your saving Balance is: $" + savingbalance + "\n");
    	
    }
    
    
 }


