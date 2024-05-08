package com.edu;

public class Example {
    public static void main(String[] args){
	String a = "Edubridge";
     
   
	
	/*for reverse
	Edubridge
	Edubridg
	Edubrid
	Edubri
	Edubr
	Edub
	Edu
	Ed
	E
	*/
	for(int j = a.length();j>1;j--) {
		System.out.println(a.substring(0,j));
	}
	
	/*E
    Ed
    Edu
    Edub
    Edubr
    Edubri
    Edubrid
    Edubridg
    Edubridge
    */
	for(int i = 1;i<=a.length();i++) {
		System.out.println(a.substring(0,i));
	}
	
	
}
}
