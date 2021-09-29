package com.abc.a.courseworkdouble1;
import java.util.Scanner;



public class Main {
static int [] nums;
// edit ur code
// save it
// go inside Git Staging
// drag and drop from unstaged changes to staged changes
// write commit message
// press commit and push
// u need to ss the process

public static void main(String[] args) {
nums = new int[]{3,2,4,5,6,6,7,8,9,9,0,9};
int result = Linear_Search(nums, 9);
if(result == -1)
{
System.out.print("Not present in the array!");
}
else
System.out.print("Number found at index "+result);
  System.out.print("SUCCESS");
}

private static int Linear_Search(int [] nums,int search)
{
for(int i=0;i<nums.length;i++)
{
if(nums[i]==search)
{
return i;


}
}
return -1;

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

  
  // see it's my old code of dice.java
  // u can just delete the whole shit 
  // or just the ones with <<<< or >>>> or ==== or any weird non coding stuff

}
}
