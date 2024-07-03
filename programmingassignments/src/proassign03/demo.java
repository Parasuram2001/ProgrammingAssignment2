package proassign03;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("enter the value of b: ");
		int b=sc.nextInt();
		System.out.println("enter the value of c: ");
		int c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("a is larger");
		else if(b>c&&b>a) {
			System.out.println("b is larger");
		}
		else {
			System.out.println("c is larger");
		}
		
		
	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
