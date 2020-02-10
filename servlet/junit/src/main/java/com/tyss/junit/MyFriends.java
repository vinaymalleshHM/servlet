package com.tyss.junit;

import java.util.AbstractList;
import java.util.ArrayList;

public class MyFriends {
	private AbstractList< String> al = new ArrayList<String>();
	
	public MyFriends() {
		al.add("venki");
		al.add("test");
		al.add("yantra");
		al.add("prince");
	}
	
	public String getName() {
		if (al.size()==0) {
			return null;
			
		} else {
			return al.remove(0);

		}
		
	}

}
