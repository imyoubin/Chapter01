package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		
		//일반적인 방식       /	
		double pi = 3.14;
		
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값 변경가능		/
		pi=3.141512;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//상수로 정의하는 방식		/
		final double PI = 3.14;   //정수로 정의할떄는 보통 대문자로 표시 /
		double result03 = PI*5*5;
		System.out.println(result03);
		
		//상수의 값을 표현히려고 하면 에러발생 
		/*		
		pi=3.1415826; pi는 상수로 선언 변환시 에러발생
		double result04 = pi*5*5;
		System.out.println(result04);*/
		
	}

}
