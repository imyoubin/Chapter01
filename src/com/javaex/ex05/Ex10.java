package com.javaex.ex05;

public class Ex10 {

	public static void main(String[] args) {
		//Ex08번을 자동화 시킴
		int[] arrA = new int[3];
		
		arrA[0]=3;
		arrA[1]=6;
		arrA[2]=9;
		
		int[] arrB = new int[3];
		
		for(int i=0; i<3; i++) {
			arrB[i]=arrA[i];
		}
			//arrA출력			
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("---------------------");
		//b출력
		for(int i=0; i<arrB.length; i++ ) {
			System.out.println(arrB[i]);
		}
		//서로 다른 2개의 배열
	}

}
