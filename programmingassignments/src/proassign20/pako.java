package proassign20;
import java.util.Scanner;
public class pako {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number: ");
		int a=sc.nextInt();
		int sum=0;
		while(a%2==0)
		{
			sum=sum+a;
			a++;
		}
		

	}

}
