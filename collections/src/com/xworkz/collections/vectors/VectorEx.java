package com.xworkz.collections.vectors;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector <String > vector =new Vector<String>();
		vector.add("e");
		vector.addElement("anusha");
		vector.addElement("music");
		vector.addElement("rock");
		vector.addElement("classic");
		vector.addElement("pop");
		vector.addElement("jazz");
		vector.insertElementAt("anusha", 1);
		vector.remove(2);
		
		Enumeration<String> enm=vector.elements();
		while(enm.hasMoreElements()){
			String musicS=enm.nextElement();
			if(musicS.length()>3){
				System.out.println(musicS);
				}
		}
	//or	
		
		for(Object music:vector)
		{
			String musicS=(String)music;
			if(musicS.length()>3){
				System.out.println(music);
				}
			}
		}
		//System.out.println(vector.get(1));
		//System.out.println(vector);
		
		
	}


