import java.util.Scanner;
import java.util.HashMap;


public class Menu extends Account{
     Scanner input=new Scanner(System.in);
     HashMap<Integer,Integer> detail=new HashMap<Integer,Integer>();
     
     public void logIn() {
    	 int a=1;
    	 do {
    		
    		detail.put(123456, 4567);
        	detail.put(456123, 7891);
    			  
         	System.out.println("Please Enter Your Customer Number");
    	    checkCustomerNumber(input.nextInt());
    			  
    	    System.out.println("Please Enter Your Pin Number");
    	    checkPinNumber(input.nextInt());
    	    
    	    
    	    int num= getCustomerNumber();
    	    int pin= getPinNumber();
    	    
    	    if (detail.containsKey(num) && detail.get(num)==pin) {
    	    	goToAccount();
    	    }else
    	    	System.out.println("\n"+"Sorry,We could not find your credentials .Wrong Customer Number or Pin number ");
    	    }while (a==1);
     }
     
       public void goToAccount() {
    	   
    	   System.out.println("Select your bank account type");
    	   System.out.println("Press 1 - Current Account");
    	   System.out.println("Press 2 - Savings Acoount");
    	   System.out.println("Press 3 - Exit");
    	   
    	   int key=input.nextInt();
    	   
    	   switch(key) {
    	   case 1:
    		   getCurrent();
    		   break;
    		   
    	   case 2:
    		   getSaving();
    		   break;
    		   
    	   case 3:
    		   System.out.println("Thank you for using Indian Student Bank ATM,bye."+"\n");
    		   break;
    		   
    	   default :
    		   System.out.println("Invalid choice");
    		   goToAccount();
    		   
    	   }
    	   
      }
       
       public void getCurrent() {
    	   
    	   System.out.println("Current Account");
    	   System.out.println("Press 1 - View Balance");
    	   System.out.println("Press 2 - To Withdraw Amount");
    	   System.out.println("Press 3 - To Deposit Amount");
    	   System.out.println("Press 4 - Exit");
    	   System.out.println("Enter your choice");
    	   
    	   int key=input.nextInt();
    	   
    	   switch(key) {
    	   case 1:
    		   System.out.println("Checking Current Account balance:" + goToCurrentBalance()+"Rupees");
    	       goToAccount();
    		   break;
    		   
    	   case 2:
    		   goToCurrentWithdraw();
    		   goToAccount();
    		   break;
    		   
    	   case 3:
    		   goToCurrentDeposit();
    		   goToAccount();
    		   break;
    		   
    	   case 4:
    		   System.out.println("Thank you for using Indian Student Bank ATM,bye."+"\n");
    		   break;
    		   
    	   default:
    		   System.out.println("\n"+"invalid choice!!");
    	       getCurrent();
    		   
    	   }
    	   	   
    }
       
       public void getSaving() {
    	   
    	   System.out.println("Saving Account");
    	   System.out.println("Press 1 - View Balance");
    	   System.out.println("Press 2 - To Withdraw Amount");
    	   System.out.println("Press 3 - To Deposit Amount");
    	   System.out.println("Press 4 - Exit");
    	   System.out.println("Enter your choice");
    	   
    	   int key=input.nextInt();
    	   
    	   switch(key) {
    	   case 1:
    		   System.out.println("Checking Saving Account balance:" + goToSavingBalance()+"Rupees");
    	       goToAccount();
    		   break;
    		   
    	   case 2:
    		   goToSavingWithdraw();
    		   goToAccount();
    		   break;
    		   
    	   case 3:
    		   goToSavingDeposit();
    		   goToAccount();
    		   break;
    		   
    	   case 4:
    		   System.out.println("Thank you for using Indian Student Bank ATM,bye."+"\n");
    		   break;
    		   
    	   default:
    		   System.out.println("\n"+"invalid choice!!");
    	       getSaving();
    		   
    	   }
   }
       
}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

