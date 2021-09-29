package com.abc.a.courseworkdouble1;
import java.util.Scanner;



public class Main {
static int [] nums;
// for push:
// edit ur code
// save it
// go inside Git Staging
// drag and drop from unstaged changes to staged changes
// write commit message
// press commit and push
// u need to ss the process
// click close thAT'S all

// for pull:
// right click courseworkdouble1
// select Team
// click Pull
// done
// just ss the process
// if u want to see update u just go github and edit the code
// i show u (coz now when u pull there are no changes)
// so example u edit code on github
// then now u try pull
// sian coz i commented need push this.

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

}
}
