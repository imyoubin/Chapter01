package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("과목을 선택하세요");
		System.out.print("과목번호:");
		//(1.자바 2.c 3. c++ 4. 파이썬)
		int num = sc.nextInt();
		if(num == 1) {//1.자바
			System.out.println("R101호");
			
		}else if(num == 2) {//2.c
			System.out.println("R202호");
			
		}else if(num == 3) {//3. c++
			System.out.println("R303호");
			
		}else if(num == 4 ) {//4. 파이썬
			System.out.println("R404호");
			
		}else {
			System.out.println("상담원에게 문의하세요");
		}
	
		
		
		sc.close();
	
	

	}

}
