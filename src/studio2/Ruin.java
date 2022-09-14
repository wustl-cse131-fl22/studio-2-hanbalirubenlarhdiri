package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to our casino! Input much money are you starting with today: ");
		double startAmount = in.nextDouble();

		System.out.println("Money you are starting with : " + startAmount);
		
		System.out.println("What would you like your win chance to be?");
		double winChance = in.nextDouble();
		
		System.out.println("Imput what you would like your win limit to be.");
		double winLimit = in.nextDouble();
		int totalSimulations = in.nextInt();
		
		
		System.out.println("Win limit: " + winLimit);
		
		double currentAmount = startAmount;
		for(int i = 0; i < totalSimulations; i++)
		{
			
	
		while (currentAmount > 0 && currentAmount < winLimit)
		
		{
			double randChance = Math.random();
			if(randChance <= winChance)
			{
				currentAmount++;
			}
			else
			{
				currentAmount--;
			}
		
		{
			
		}
				

		

	}

	}
}
}
