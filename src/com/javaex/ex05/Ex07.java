package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] intArray;
		intArray = new int[5];
		
		intArray[0]=3;
		intArray[1]=6;
		intArray[2]=9;
		
		int result=0;
		
		for(int i=0; i<intArray.length; i++) {
			result=result+intArray[i];			
		    System.out.println("intArra의 4번째 값: "+ intArray[i]);
		}
		
		//System.out.println("intArra의 4번째 값: "+ intArray[i]);
	}

}
