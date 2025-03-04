package encapexam;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setname("priya");
		s.setaddress("abs");
		s.setage(37);
		String m=s.getname();
		int n=s.getage();
		String o=s.getaddress();
		System.out.println(m+n+o);
	}

}
