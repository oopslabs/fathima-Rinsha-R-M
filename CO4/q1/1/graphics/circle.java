package graphics;

public class circle implements inter{
	int r;
	public circle(int i) {
		r=i;
	}
	public void area() {
		System.out.println("Area"+(3.14*r*r));
	}

}
