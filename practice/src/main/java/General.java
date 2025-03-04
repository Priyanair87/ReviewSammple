import intefaceexam.Animal;
import intefaceexam.Mamal;

public  class General implements Animal,Mamal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General g=new General();
		g.eat();
		g.display();
		g.travel();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("all food");
		System.out.println(b);
		System.out.println(a);
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("crawl");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("all animals");
	}

}
