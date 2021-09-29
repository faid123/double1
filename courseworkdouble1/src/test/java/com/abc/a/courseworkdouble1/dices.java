package com.abc.a.courseworkdouble1;
import java.util.Scanner;



public class Main {
static int [] nums;
// nvm u edit ady then u do this way
// go git repositories
// under local/branch1
// right click
// then click push
// remember to save this file
// cb the vpn like shyt


public static void main(String[] args) {
nums = new int[]{3,2,4,5,6,6,7,8,9,9,0,9};
int result = Linear_Search(nums, 9);
if(result == -1)
{
System.out.print("Not present in the array!");
}
else
System.out.print("Number found at index "+result);
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