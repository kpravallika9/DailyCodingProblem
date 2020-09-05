//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
import java.util.Scanner;
import java.io.*;
class Day1
{
	
	static void add(int key,int range,int[] ary){
			
			int flag=1,count=1;	
		for (int i=0;i<range;i++){
			for(int j=0;j<range;j++){
			if((ary[i]+ary[j])==key){ 
			  flag=0;
			  count=0;
			  System.out.println("true");
			  break;
			  }
			}
			if(count==0)
				 break;
		}
		if(flag==1)
			 System.out.println("false");
		
			
		}
	public static void main(String args[])
	{	
		int[] ary=new int[100];
		int key,range;
		Scanner s=new Scanner(System.in);
		System.out.println("Select length upto 100");
		range=s.nextInt();
		if(range>=2){
			System.out.println("Enter " +range+ " numbers");	
		for(int i=0;i<range;i++){
			ary[i]=s.nextInt();
		}
		System.out.println("Enter key value");
		key=s.nextInt();
	     add(key,range,ary);
		}
		else 
			System.out.println("Enter atleast two numers");
	}
	
}