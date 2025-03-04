package review;

import java.util.Scanner;

public  class PerEmp extends Emp{

	public  void leaveCal()
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("days and allowed days");
		int totaldays=sc.nextInt();
		int allowdays=sc.nextInt();
	    int total= (totaldays+30)-allowdays;
		System.out.println(total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PerEmp p=new PerEmp();
p.leaveCal();
ConEmp ce=new ConEmp();
ce.leaveCal();
	}

	
	}


