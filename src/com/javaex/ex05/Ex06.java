package com.javaex.ex05;

public class Ex06 {
	
	public static void main(String[] args) {
	
		double[] doubleArr=new double[3];
		
		doubleArr[0]=3.14;
		doubleArr[1]=9.15;
		doubleArr[2]=6.21;
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
			
		}
		
		System.out.println("-------------------------");
		
		char[] charArr = new char[3];
		charArr[0]='a';
		charArr[1]='b';
		charArr[2]='c';
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
			
		}
		
		System.out.println("-------------------------");
		
		String[] strArr = new String[3];
		
		strArr[0]="임유빈";
		strArr[1]="유재석";
		strArr[2]="강호동";
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
			
		}
		System.out.println(strArr[1]);
		
	}
}
