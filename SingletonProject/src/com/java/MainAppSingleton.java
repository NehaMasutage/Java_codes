package com.java;

class DataBaseConnection{
	private static DataBaseConnection connectionobject;
	private DataBaseConnection() {
		
	}
	
	public static DataBaseConnection getObj() {
		
		if(connectionobject == null) 
			connectionobject = new DataBaseConnection();
		return connectionobject;
		
	}
	
	public void getData() {
		System.out.println("getData method is called");
	}
}

public class MainAppSingleton {

	public static void main(String[] args) {
		//DataBaseConnection dataobj = new DataBaseConnection();
		DataBaseConnection dataobj = DataBaseConnection.getObj();
		
		DataBaseConnection dataobj1 = DataBaseConnection.getObj();
		dataobj.getData();
		
		System.out.println(dataobj);
		System.out.println(dataobj1);
		
	}

}