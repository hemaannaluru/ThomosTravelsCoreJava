package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Tester {

	public static void main(String[] args) {
     Driver d1=new Driver(1,"Ramesh","Car",120.8);
     Driver d2=new Driver(2,"Suresh","Car",150.8);
     Driver d3=new Driver(3,"Harish","Bike",170.7);
     Driver d4=new Driver(4,"Jaggu","Auto",1250.10);
     Driver d5=new Driver(5,"kalyan","Auto",1203.8);
     Driver d6=new Driver(6,"Ganesh","Bike",150.8);
     ArrayList<Driver> driverlist=new ArrayList<>();
     driverlist.add(d1);
     driverlist.add(d2);
     driverlist.add(d3);
     driverlist.add(d4);
     driverlist.add(d5);
     driverlist.add(d6);
     Travel t=new Travel();
     boolean method1result=t.isCarDriver(d2);
     System.out.println(method1result);
     String method2result=t.retrivebyDriverId(driverlist, 2);
     System.out.println(method2result);
     int method3result=t.retriveCountOfDriver(driverlist,"Bike");
     System.out.println(method3result);
     ArrayList<Driver> method4result=t.retriveDriver(driverlist,"Bike");
    for(Driver s:method4result) {
    	System.out.println(s.getDriverName());
    }
    String method5result=t.retriveMaximumDistanceTravelledDriver(driverlist);
    System.out.println(method5result);
    
	}

}
