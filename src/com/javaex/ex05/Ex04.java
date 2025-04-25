package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
					
		int[] intArray = new int[3];		
		intArray[0]=3;
		intArray[1]=6;
		intArray[2]=9;
		
		//(System.out.println(intArray[i]););
		/*
		for(int i = 0; i <3; i++) {
			System.out.println(intArray[i]);
			*/
		
		//length => 끝방까지 출력
		for(int i = 0; i<intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
		
		
		System.out.println("-----------------");
		System.out.println(intArray.length);
		
		
		/*
		 * int[] intArray= new int[3] {1,2,3}; 에러남
		 * int[] intArray= new int[] {1,2,3}; 	사용가능하나 권장은 아님
		 * int[] intArray= {1,2,3};사용가능하나 권장은 아님
		 */
		
	}

}
