package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 3:
			System.out.println("30일");
			break;
		case 5:
			System.out.println("31일");
			break;
		case 6:
			System.out.println("30일");
			break;
		case 7:
			System.out.println("31일");
			break;
		case 8:
			System.out.println("31일");
			break;
		case 9:
			System.out.println("30일");
			break;
		case 10:
			System.out.println("31일");
			break;
		case 11:
			System.out.println("30일");
			break;
		case 12:
			System.out.println("30일");
			break;
			
		default:
			System.out.println("31일");			
		
		}
					
		sc.close();
		
		
		//권장사항은 아님
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
			
		case 2:
			System.out.println("28일");
			break;
			
		default:
			System.out.println("31일");
			break;
		
		}
				
		
		sc.close();
		*/
		/*[if 문으로 작성]
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			days = 30;
			}else if (month == 2) {
			days = 28; 
			}else {
			days = 31;
			}		
		sc.close();
		
		*/
	
	}
}
