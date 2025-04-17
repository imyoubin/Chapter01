package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//키보드 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num =sc.nextInt();	//입력대기 숫자열
		System.out.println(num);
		
		
		//키보드 해제
		sc.close();
		
		

	}

}
