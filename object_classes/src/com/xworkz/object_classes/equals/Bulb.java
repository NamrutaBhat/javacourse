package com.xworkz.object_classes.equals;

public class Bulb {
	
		String type;
		String brand;
		double price;
		
		public Bulb(String type,String brand,double price)
		{
			this.type=type;
			this.brand=brand;
			this.price=price;
		}
		
		
		public boolean equals(Object obj)
		{
			if(obj instanceof Bulb){
			Bulb bulb= (Bulb)obj;
			
			 if(this.brand.equals(bulb.brand)){
				 if(this.type.equals(bulb.type)){
					 if(this.price==bulb.price){
						 return true;
					 }
					 else
						{
							return false;
						}

				 }
				 else
					{
						return false;
					}
 
				 }
			 
			
		else
		{
			return false;
		}
		}

			return false;
}
}
