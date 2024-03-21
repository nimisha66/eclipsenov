package oops;

import java.util.Scanner;

	interface bank_application
	{
		public void accountdetails();
		public void balance();
		public void widraw();
		public void deposite();
	}
	class bankdetails implements bank_application
	{
		Scanner sc =new Scanner(System.in);
		int balance =100000;
		String bankname="canara bank";
		int accountno=147896523;
		String ifsc= "can789258";
		String accountname="nimisha n";
		String branchname="palakkad";

		@Override
		public void accountdetails() {
			System.out.println("accountdetails");
			System.out.println("bankname="+bankname);
			System.out.println("accountname="+accountname);
			System.out.println("accountno"+accountno);
			System.out.println("ifsc="+ifsc);
			System.out.println("branchname="+branchname);
		}

		@Override
		public void balance() {
			System.out.println("current balance="+balance);
			
		}

		@Override
		public void widraw() 
		{
			System.out.println("enter a amount to widraw");
			int wd=sc.nextInt();
			if(wd<=balance)
			{
				balance=balance-wd;
				System.out.println("current balance="+balance);
			}
			else 
				{
					System.out.println("insufficient balance");
				}
			}
				
			
		

		@Override
		public void deposite() {
		System.out.println("enter a amount to deposit");
		int dp=sc.nextInt();
		balance=balance+dp;
		System.out.println("current balance="+balance);
			
		}
		
	}

	public class Bankpgm {

		public static void main(String[] args) {
			bank_application ob=new bankdetails();
			ob.accountdetails();
			ob.balance();
			ob.widraw();
			ob.deposite();
			
		}

	}
	
