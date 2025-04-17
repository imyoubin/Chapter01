package com.javaex.ex01;

public class Ex11 {
	public static void main(String[] args) {
		
		//논리연산자//
		//AND(&&두개의 값이 true 일때만 true 이고 하나라도 false 이면 false 이고 둘대 false 이면 false 이다//
		int a = 7;
		int b = 5;
		System.out.println("&& (연산자 엄격 깐깐)---------");
		
		System.out.println(true&&true);		//true
		System.out.println(true&&false);	//false
		System.out.println(false&&true);	//false
		System.out.println(false&&false);	//false
		
		System.out.println("|| (연산자 덜 깐깐)---------");
		//OR(||두개의 값이 true
		System.out.println(true||true);		//true
		System.out.println(true||false);	//true
		System.out.println(false||true);	//true
		System.out.println(false||false);	//false
		
		System.out.println("! (연산자 반대)---------");	
		System.out.println(true);	//true
		System.out.println(false);	//false
		
		System.out.println("(응용)---------");
		boolean result = (a<b)&&(a>b);	//5<7 && 5>7 => t && f ==>f
		System.out.println(result);
		
		System.out.println(true && false || true);  //t&&f||t t&&f f, f&&t t
		System.out.println(true || false || true);	//t||f t t||t t
		
		System.out.println( !(a>b) );	//7>5 f
		
	}


}
