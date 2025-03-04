package review;
import java.util.Scanner;
public class ConEmp extends Emp {

	public  void leaveCal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("days and allowed days");
		int days=sc.nextInt();
		int alloweddays=sc.nextInt();
		int total=days-alloweddays;
		System.out.println(total);
	}

	
}
