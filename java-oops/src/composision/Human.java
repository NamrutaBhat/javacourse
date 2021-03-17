package composision;

public class Human {
String name="Vinu";
int age=19;
String dob="20-06-2002";

Heart heart=new Heart();

String retrieveHeartSettings()
{
	return heart.bloodPressure;
	
}
}
