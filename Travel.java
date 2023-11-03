package com;

import java.util.ArrayList;

public class Travel {
	boolean isCarDriver(Driver ob) {
		if(ob.getCategory().equals("Car")) {
			return true;
		}
		else
			return false;	
	}
	String retrivebyDriverId(ArrayList<Driver> d,int id) {
		for(Driver list:d) {
	    if(list.getDriverId()==id) {
	    	return "Driver name is "+list.getDriverName()+" "+"Belonging to the category "+list.getCategory()+" "+"traveled"+list.getTotalDistance()+" "+"Km so far";	
		}
	}
		return "There is no such driver belonging to the id: "+id;
	}
	int retriveCountOfDriver(ArrayList<Driver> c,String catName) {
		int count=0;
		for(Driver list:c) {
			if(list.getCategory().equals(catName)) {
				count++;
			System.out.println(list.getDriverName());}
		}
		if(count==0)
			System.out.println("There is no such driver belonging to the category: "+catName);
		return count;
		 
		
	}
	ArrayList<Driver> retriveDriver(ArrayList<Driver> r,String catName){
		ArrayList<Driver> result=new ArrayList<>();
		for(Driver list:r) {
			if(list.getCategory().equals(catName)) {
				result.add(list);	
			}
		}
		return result;
	}
	String retriveMaximumDistanceTravelledDriver(ArrayList<Driver> m) {
		double max=0.0;
		String n=null;
		for(Driver list:m) {
			if(list.getTotalDistance()>max) {
				max=list.getTotalDistance();
				n=list.getDriverName();
			}
			
		}
		return n;
		
	}

}
