import java.util.Scanner;
public class ATM 
{
	public static void main(String[] args)
	{
		Scanner sp = new Scanner(System.in);
		System.out.println("\n\n\t\t\t----------WELCOM TO SKD's ATM:----------");

		System.out.print("\n\n\t\t\tPlease Enter Your PIN : ");
		int enteredPin = sp.nextInt();
		
		int pin = 2001;
		int balance=50000;
		
	
		if(enteredPin == pin)
		{
			while(true)
			{
				System.out.print("\n\n\t\t\t-----------------ATM MENU-------------------\n\n\n");
				System.out.println("\t\t\t1.CheckBalance\n");
				System.out.println("\t\t\t2.Deposit\n");
				System.out.println("\t\t\t3.Withdrawl\n");
				System.out.println("\t\t\t4.Change PIN\n");
				System.out.println("\t\t\t5.Exit\n");
				
				
				System.out.print("\t\t\tEnter Your Choice: ");
				int choice=sp.nextInt();

			switch(choice){


			 
			 case 1:
		 		System.out.print("\n\n\t\t\tYour Balance is: Rs/- "+ balance);
		 		break;
		 	

		 	case 2:
		 		System.out.print("\n\n\t\t\tEnter Deposit Amount: Rs/- ");
		 		Scanner ss = new Scanner(System.in);
		 		int depositamount=ss.nextInt();
		 		balance+=depositamount;
		 		System.out.print("\n\n\t\t\tDeposit Successfull... Total Balance is: Rs/- "+balance);
		 		break;
		 	

		 	case 3:
		 		System.out.print("\n\n\t\t\tEnter Withdrawl amount: ");
		 		Scanner sm = new Scanner(System.in);
		 		int withdrawlamount=sm.nextInt();
		 		if(withdrawlamount < balance)
		 		{
		 		balance-=withdrawlamount;
		 		System.out.println("\n\n\t\t\tWithdrawl Successfull...Total Balance is: Rs/- "+balance);
		 		}
		 		else
		 		{
		 		System.out.print("\n\n\t\t\tWithdrawl Failed ");
		 		}
		 		break;

		 		case 4:
		 		System.out.print("\n\n\t\t\tEnter Your New PIN: ");
		 		int newpin=sp.nextInt();
		 		pin=newpin;//For Updating And Creating A New PIN 
		 		System.out.println("\t\t\tPIN Changed Successfully.");
		 		break;

		 	
		 	
		 	case 5:
		 		System.out.print("\n\n\t\t\tThank You Have A Good Day. ");
		 		System.exit(0);
		 		break;

		 		default:
		 		System.out.print("\t\t\tInvalid Choice!!!");
				}
			
			}
		
		}
		else
		{
			System.out.println("Incorrect PIN Try Again");
		}
	}
}
