package com.java;


class SingletonDemo{
	private static SingletonDemo demoObject;
	private SingletonDemo() {
		
	}
	
	public static SingletonDemo getObj() {
		if (demoObject == null)
			demoObject = new SingletonDemo();
		return demoObject ;
	
	}
	public void getData() {
		System.out.println("getData method is called");
	}
}
public class SingletonEx {

	public static void main(String[] args) {
		//DataBaseConnection dataobj = new DataBaseConnection();
		SingletonDemo dataobj = SingletonDemo.getObj();
				
		SingletonDemo dataobj1 = SingletonDemo.getObj();
				dataobj.getData();
				
				System.out.println(dataobj);
				System.out.println(dataobj1);

	}

}
