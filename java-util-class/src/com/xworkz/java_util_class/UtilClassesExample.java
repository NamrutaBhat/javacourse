package com.xworkz.java_util_class;
import java.util.Calendar;

public class UtilClassesExample {

	public static void main(String[] args) {
      Calendar calender= Calendar.getInstance();
      int year=2021;
      int month=2;
      int day=20;
      int hour=12;
      int minute=50;
      int second=45;
      
      calender.set(year,month,day,hour,minute,second);
      System.out.println("YEAR :"+calender.get(  Calendar.YEAR));
      System.out.println("MONTH :"+calender.get(  Calendar.MONTH));
      System.out.println("DAY :"+calender.get(  Calendar.DAY_OF_MONTH));
      System.out.println("HOUR :"+calender.get(  Calendar.HOUR));
      System.out.println("MINUTE :"+calender.get(  Calendar.MINUTE));
      System.out.println("SECOND :"+calender.get(  Calendar.SECOND));
      
      

	}

}
