package com.abc.a.courseworkdouble1;
import java.util.Random;

public class dices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rollTwoDice();
		System.out.println("Dice have been rolled successfully!");

	}
	
	public static void rollTwoDice()
	{
		int min1 = 1;
		int max1 = 6;
		
		int min2 = 1;
		int max2 = 6;

		Random random1 = new Random();
		Random random2 = new Random();

		int value1 = random1.nextInt(max1 + min1) + min1;
		int value2 = random2.nextInt(max2 + min2) + min2;
		
		System.out.println("Dice 1: " + value1);
		System.out.println("Dice 2: " + value2);
		System.out.println("Total Rolled Value: " + (value1 + value2));
	}
	
	public static void rollDice()
	{
		int min = 1;
		int max = 6;
		
		Random random = new Random();
		
		int value = random.nextInt(max + min) + min;
		
		System.out.println("Dice 1: " + value);
	}

}
