package proassign17;

public class dum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=45;
		String binary=" ";
		if(no==0)
		{
			binary="0";
		}
		else {
			while(no>0)
			{
				int rem=no%2;
				binary=binary+rem; 
				no=no/2;
			}
		}
		System.out.println(binary);

	}

}
