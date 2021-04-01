package composision;

public class Human {
	Heart heart=new Heart();
	


Boolean human=heart.pumpingBlood;
String details=heart.bloodPressure;

void getHumanDetails()
{
	System.out.println("heart funtionality");
	
}



String retrieveHeartSettings()
{
	return heart.bloodPressure;
	
}
}
