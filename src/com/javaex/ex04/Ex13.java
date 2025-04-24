package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int sum = 0;
		int num;
		System.out.println();
		
		do {
			//숫자입력
			 num = sc.nextInt();
			//합계 누적
			sum = sum +num;
			//합계출력
			System.out.println("합계: " + sum);
			
		}
		
		while(num<=0); {
			
			sc.close();
			}
			*/
		/////////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0; 
		System.out.println("숫자를 입력하세요.");
		
		while(true) {
			int num = sc.nextInt();
			sum = sum=num;
			System.out.println("합계: "+sum);
			if(num==0) {
				break;
			}
			
		}
		System.out.println("종료");
		sc.close();
		
		}
		

}
