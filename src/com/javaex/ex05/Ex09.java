package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		
		arrA[0]=3;
		arrA[1]=6;
		arrA[2]=9;
		
		int[] arrB=arrA;
		//A베열출력
		for(int i=0; i<3; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("--------------------");
		//B배열출력
		for(int i =0; i<3; i++ ) {
			System.out.println(arrB[i]);
		}
		System.out.println("------------------");
		
		arrA[1]=100;
		for(int i=0; i<3; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("----------------------");	
		for(int i =0; i<3; i++ ) {
			System.out.println(arrB[i]);
		}
		//arrB를 통해서[2] 100으로 변경
		//arrA와 arrB동시에 바뀌는지 확인
		System.out.println("----------------------");
		arrB[2]=100;
		for(int i =0; i<3; i++ ) {
			System.out.println(arrB[i]);
		}
	}

}
