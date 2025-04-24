package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		//for문 6번
		int no01;
		int no02;
		int no03;
		int no04;
		int no05;
		int no06;
		
		//변수값을 아래와 같이 식으로 표현할수없다 
		for (int i = 1; i<=6; i++ ) {
			int no = (int)(Math.random()*45)+1;//배열로
			System.out.println(no);
		}
		System.out.println("============================");
		/*
		int no1 = (int)(Math.random()*45)+1;
		int no2 = (int)(Math.random()*45)+1;
		int no3 = (int)(Math.random()*45)+1;
		int no4 = (int)(Math.random()*45)+1;
		int no5 = (int)(Math.random()*45)+1;
		int no6 = (int)(Math.random()*45)+1;
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);
		*/
	}

}
