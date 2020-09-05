//Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the
//original array except the one at i.

//For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
//If our input was [3, 2, 1], the expected output would be [2, 3, 6].
import java.util.Scanner;
import java.io.*;
class Day2{
	public static void main(String args[]){
		int[] ary=new int[10];
		int length,result;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length upto 10");
		length=s.nextInt();
		System.out.println("Enter "+length+" numbers");
		for(int i=0;i<length;i++){
			ary[i]=s.nextInt();
		}
		for(int i=0;i<length;i++){
			result=1;
			for (int j=0;j<length;j++){
				if((j<i)||(j>i))
					result=result*ary[j];	
			}
			System.out.println(result);
		}
	}
	
}