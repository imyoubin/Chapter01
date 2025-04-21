package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.print("과목:");
		
		String code = sc.nextLine();
		switch(code) {//A.B.C.D.E F G
		case "A":
			System.out.println("R101호");
			break;
		case "B":
			System.out.println("R202호");
			break;
		case "C":
			System.out.println("R03호");
			break;
		case "D":
			System.out.println("R404호");
			break;
		default:
			System.out.println("상담원에게 문의하세요");
			
		
		}
		sc.close();

	
	}

}
