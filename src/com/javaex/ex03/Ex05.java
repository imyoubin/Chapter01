package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간");
		int time = sc.nextInt();
		int  sum;
		if(time <=8) {
			sum = time *10000; 
						
		}else {
			sum = (8*10000) +(int)((time - 8)*10000*1.5);
			
		}
		System.out.println("임금은 " +sum+ "입니다");
		sc.close();

	}

}
