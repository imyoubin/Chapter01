package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		//대입연산자//   = 변수 대입 
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//산술연산자//
		int sum = a + b;
		System.out.println(sum);	//+
		
		System.out.println(a+b);	//+	
		System.out.println(a-b);	//-
		System.out.println(a*b);	//*	
		System.out.println(a/b);	//7/2=(3)---1
		System.out.println(a%b);	//7/2=3---(1)
		
		System.out.println(7/2);   // 정수 / 정수 = 3(정수)
		System.out.println(7.0/2); // 실수 / 정수 = 3.5(실수)
		System.out.println(7.0/2.0); //실수 / 실수 = 3.5(실수)
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//부호연산자//
		int var = -3;
		int pvar = -var; //-(3) ==>3
		System.out.println(pvar);
		
		int mvar = + var;	// +(-3) ==>-3
		System.out.println(mvar);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//증가 감소 연산사//
		System.out.println(a);	//7
		System.out.println(++a); //7 --> 8 변수값 변경 +1 출력
		System.out.println(a);	//8
		
		System.out.println(b);	//2
		System.out.println(--b);	//2 --> 1 변수값 변경 
		System.out.println(b);	//1
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		System.out.println(a);	//8
		System.out.println(a++); //8   +1 출력
		System.out.println(a); //9
		
		System.out.println(b);	//1		
		System.out.println(b--); //1	-1 출력
		System.out.println(b);	//0
		
		//해햐할일을 나열 가장먼저 할지 가장 나중에 할지 결정
		System.out.println("--------------------------");
		
		int c= 5;
		System.out.println(c);	//5
		System.out.println(++c*2);	// +1, *2 = 12 출력
		System.out.println(c);	// 6
		
		int d =5;
		System.out.println(d); //5
		System.out.println(d++*2);	//
		System.out.println(d);
		
		}

}
