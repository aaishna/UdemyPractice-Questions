package com.bfm.MapPrac;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SynchronizedMap {
    
    
    public static void main(String[] args)
    {
        HashMap<String,String> map = new HashMap<String,String>();
    	Map<String,String> premiumPhone = Collections.synchronizedMap(map);
        premiumPhone.put("Apple", "iPhone6");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S6");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }
        
    }
    
}


