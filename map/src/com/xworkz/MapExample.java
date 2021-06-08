package com.xworkz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		   HashMap<String,String> hm=new HashMap<>();
        hm.put("bangalore","RCB");
        hm.put("hyderabad","srh");
        hm.put("chennai","csk");
        hm.put("kolkatta","kkr");
        hm.put("delhi","dc");
        hm.put("rajasthan","rr");
        hm.put("punjab","pbks");
        hm.put("mi","mubai");
        System.out.println(hm);
        
        for(Map.Entry<String,String> entry : hm.entrySet()){
          System.out.println(entry.getKey()+entry.getValue());
        }
        System.out.println(hm.get("bangalore"));
        
        
        HashMap<String,ArrayList<String>> hm1=new HashMap<String,ArrayList<String>>();
        hm1.put("rcb", new ArrayList<String>());
        hm1.get("rcb").add("ABD");
        hm1.get("rcb").add("harshal patel");
        hm1.get("rcb").add("Maxwell");
        
        for(Entry<String, ArrayList<String>> entry : hm1.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
          }
        
        
        
        
        
        

	}

}
