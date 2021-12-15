package com.market;

import java.util.Scanner;

public class Stocks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanstr = new Scanner(System.in);
		Demat demat = new Demat();
		Account account = new Account();
		int amount = 0;
		int count = 0;
		while (count == 0) {
			System.out.println("[1]buy [2]sell [3] withdraw");
			int option = scanner.nextInt();
			switch (option) {
				case 1:
					demat.buy();
					break;
					
				case 2:
					String company = demat.compname();
					int shareCount = demat.count();
					double sharePrice = demat.shareprice();
					account.sell(company, shareCount, sharePrice);
					break;
					
				case 3:
					System.out.println("enter the amount to withdraw");
					amount =  scanner.nextInt();
					System.out.println( account.debit(amount));
					
			}		
		}	
	}
	
	
}
