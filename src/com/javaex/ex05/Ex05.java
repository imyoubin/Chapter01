package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		/*
		int[] intAray = new int[3];
		
		intAray[0]=3;
		intAray[1]=6;
		intAray[2]=9;
		*/
		//숫자를 빼야함
		//int[] intAray = new int[] {1,2,3};
		
		//지금상태에선 권장하지안음
		int[] intAray={1,2,3};
		
		for(int i=0; i< intAray.length;i++) {
			System.out.println(intAray[1]);
		}
	}

}
