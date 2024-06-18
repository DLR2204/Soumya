package casestudy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();

		HashMap<Byte,Transaction> transactions = new HashMap<Byte,Transaction>();
		
		String accHolderName;
		
		long accNo;
		
		long contactNo;
		
		String typeOfAcc;
		
		float accBal=0;
		
		Account account;
		
		boolean value = true;
		
		while(value) {
		System.out.println("Welcome to the Bank Application");
		System.out.println("*******************************");
		
		System.out.println();
		
		System.out.println("1.Create a new bank Account");
		
		System.out.println("2.Check Balance");
		
		System.out.println("3.Deposit");
		
		System.out.println("4.Withdraw");
		
		System.out.println("5.FundTransfer");
		
		System.out.println("6.Bank Statement");
		
		System.out.println("7.Check Account Details");
		
		System.out.println("Please enter your option:- ");
		
		int option = scan.nextInt();
		
		switch(option) {
		case 1 :{
			System.out.println();
			System.out.println("**********ACCOUNT REGISTRATION***********");
			System.out.println();
			
			System.out.print("Please enter your name:-");
			accHolderName = scan.next();
			System.out.print("Please enter your contact number:-");
			contactNo = scan.nextLong();
			System.out.print("Please enter the type of your account:-");
			typeOfAcc = scan.next();
			
			accNo = contactNo- 198474456;
			
			account = new Account(accHolderName, accNo, contactNo, typeOfAcc, accBal);
			
			accounts.put(accNo, account);
			
			System.out.println("congrats your account is created with the account number :-"+accNo);
			
			System.out.println();
			
			
			break;
		}
		case 2 :{
			System.out.println();
			System.out.println("**********BALANCE CHECK***********");
			System.out.println();
			
			System.out.print("Enter your account number:- ");
			accNo = scan.nextLong();
			
			account = accounts.get(accNo);
			
			accBal = account.getAccBal();
			
			System.out.println("Your account balance is:-"+accBal);
			
			System.out.println();
			
			
			
			break;
		}
		case 3 :{
			System.out.println();
			System.out.println("**********DEPOSIT MONEY***********");
			System.out.println();
			
			System.out.print("Please enter your account number:-");
			accNo = scan.nextLong();
			
			System.out.print("Please enter your deposit amount:- ");
			float depositAmount = scan.nextFloat();
			
			account = accounts.get(accNo);
			
			float existingAmount = account.getAccBal();
			
			accBal = depositAmount + existingAmount;
			
			account.setAccBal(accBal);
			
			System.out.println("Your amount is credited succesfully");
			
			System.out.println("Your current balance is :-" +accBal);
			
			LocalDate date = LocalDate.now();
			
			Random random = new Random();
			
			Byte transId = (byte) random.nextInt();
			
			Transaction transaction = new Transaction(transId, accNo, "Deposit", date, 0, depositAmount, accBal);
			
			transactions.put(transId, transaction);
			
			break;
		}
		case 4 :{
			System.out.println();
			System.out.println("**********WITHDRAWL***********");
			System.out.println();
			System.out.print("Enter your account number:-");
			accNo = scan.nextLong();
			
			System.out.print("Enter your withdrawal amount:-");
			float withdrawalAmount = scan.nextFloat();
			
			account = accounts.get(accNo);
			
			float existingBalance =account.getAccBal();
			
			if(existingBalance > 500 && withdrawalAmount < existingBalance ) {
			
			accBal = existingBalance-withdrawalAmount;
			
			account.setAccBal(accBal);
			
			System.out.println("Your amount is debited successfully");
			
			}
			else
				System.out.println("You don't have sufficient funds!!!!");
			
			System.out.println("Your current balance is :-"+accBal);
			
			LocalDate date = LocalDate.now();
			
			Random random = new Random();
			
			Byte transId = (byte) random.nextInt();
			
			Transaction transaction = new Transaction(transId, accNo, "withdraw", date, withdrawalAmount, 0, accBal);
			
			transactions.put(transId, transaction);
			
			break;
		}
		
		case 5 :{
			System.out.println();
			System.out.println("**********FUND TRANSFER***********");
			System.out.println();
			
			System.out.print("Please enter your account number :-");
			long accNoFrom = scan.nextLong();
			
			System.out.print("Plese enter to account number:-");
			long accNoTo = scan.nextLong();
			
			System.out.print("Please enter the transfer amount:-");
			float transferAmount = scan.nextFloat();
			
			Account fromAccount = accounts.get(accNoFrom);
			
			Account toAccount  = accounts.get(accNoTo);
			
			float fromAccountBalance = fromAccount.getAccBal();
			
			float toAccountBalance = toAccount.getAccBal();
			
			fromAccountBalance = fromAccountBalance - transferAmount ;
			
			toAccountBalance = toAccountBalance + transferAmount;
			
			fromAccount.setAccBal(fromAccountBalance);
			
			toAccount.setAccBal(toAccountBalance);
			
			
			
			System.out.println("\n Amount is transferred succesfully");
			
			System.out.println("The current balance is :-" +fromAccountBalance);
			
			LocalDate date = LocalDate.now();
			
			Random random = new Random();
			
			Byte transId = (byte) random.nextInt();
			
			Transaction transaction = new Transaction(transId, accNoFrom, "FundTransfer", date, transferAmount, 0, fromAccountBalance);
			
			transactions.put(transId, transaction);
			
			break;
		}
		case 6 :{
		
			System.out.println("\n **********PRINTING STATEMENT***********");
			
			System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s","transId","accNo","typeOfTrans","Date","W.Amount","D.Amount","C.Balance");
			
			System.out.println();
			
			Set<Byte> set = transactions.keySet();
			
			Iterator itr = set.iterator();
			
			while(itr.hasNext()) {
				Byte key = (Byte) itr.next();
				
				Transaction trans = transactions.get(key);
				
				System.out.println(trans.getTransId()+"     "+trans.getAccNo()+"     "+trans.getTypeOfTrans()+"    "+trans.getDate()+"     "+trans.getWithdrawalAmount()+"     "+trans.getDepositAmount()+"     "+trans.getBalance());
				
			}
			
			
			value = false;
			break;
		}
		case 7 :{
			System.out.println("\n **********CHECK ACCOUNT DETAILS***********");
			
			
			System.out.print("\n please enter your account number:-");
			
			accNo = scan.nextLong();
			
			account = accounts.get(accNo);
			
			System.out.println("\n" +account); 
			
			value = false;
			
			break;
		}
		default :{
			System.out.println();
			System.out.println("********** Please visit us again ***********");
			System.out.println();
			value = false;
			break;
		}
			
		
		}
		}
		
	}

}
