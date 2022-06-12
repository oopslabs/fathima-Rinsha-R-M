package graphics;

public class rectangle implements inter{
	int l,b;
	public rectangle() {
		System.out.println("Enter the l and b");
		l=s.nextInt();
		b=s.nextInt();
	}
	public void area() {
		System.out.println("Area:"+(l*b));
	}
}
