package exceptionexam;

public class ExceptionUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[]= {1,2,3,4};

System.out.println("hiiii");
try {
	try {
	x[5]=9;
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);

	}
	int b=8/0;
	}catch(ArithmeticException e) {
		System.out.println(e);
    }
finally {
System.out.println("hhhhh");

}
}
}
