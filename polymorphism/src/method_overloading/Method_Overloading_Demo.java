package method_overloading;

public class Method_Overloading_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(8,9);
		add(4.0f);
		
		
		

	}

	
static	int add(int a,int b)
	{
	System.out.println(a+b);
		return (a+b);
	}
	
	int add(int a)
	{
		System.out.println(a);
		return a;
	}
	
static	float add(float b)
	{
	System.out.println(b);
		return b;
	}

}



