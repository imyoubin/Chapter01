package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
		
		int num = sc.nextInt();
		if(num>0) {
			//양수일때
			if(num%2==0) {
			//짝수면
				System.out.println("짝수");
				//홀수면
			}else {
				System.out.println("홀수");
			}
			//음수면
		}else if(num<0) {
			System.out.println("음수");
		//0이면	
		}else {
			System.out.println("0");
		}
		
	
		
		
		sc.close();
	
	}

}
