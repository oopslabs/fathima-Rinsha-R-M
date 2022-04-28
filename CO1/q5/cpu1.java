package product;

public class cpu1 {
	float price;
	public cpu1(float price)
	{
		this.price=price;
	}
    class processor{
    	int no_of_cores;
    	String manufacturer;
    	public processor(int no_of_cores,String manufacturer)
    	{
    		this.no_of_cores=no_of_cores;
    		this.manufacturer=manufacturer;	
    	}
    	void display()
    	{
    		System.out.println("no ofcores:"+no_of_cores);
    		System.out.println("Manufacturer:"+manufacturer);
    	}
    	
    }
    public static class ram
    {
     static int memory;
     static String manufacturer;
     static public void data(int memory1,String manufacturer1)
     {
         memory=memory1;
         manufacturer=manufacturer1;
     }
     static void display()
 	{
 		System.out.println("memory:"+memory);
 		System.out.println("manufacturer:"+manufacturer);
 	}
    }
    public static void main(String args[])
    {
    	cpu1.processor obj=new cpu1(25000).new processor(5,"intel");
    	obj.display();
    	cpu1.ram.data(800,"asus");
    	cpu1.ram.display();
    	
    }
}
