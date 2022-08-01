package Sample1;

import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) {
		
		System.out.println("Hi Yogesh new changes ");
		System.out.println("Enter no.:");
		Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		int fact=1;
		for (int i = num; i>=1; i--) 
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
