package constructor_chaining;

public class Capsicum extends Vegetable{
	String color;
	String shape;
	double price;
	
	public Capsicum()
	{
		super("capsicum");
		
	}
	
Capsicum(String color,String shape,double price)
{
	super("capsicum");
	this.color=color;
	this.shape=shape;
	this.price=price;
	
}
	

}
