package proassign7;

import java.util.Scanner;

public class demi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the natural number: ");
		int no=sc.nextInt();
		int mul=1;
		for (int i=1;i<=10;i++)
		{
			mul=no*i;
			System.out.println(no+"x"+i+"="+mul);	
		}

	}

}
