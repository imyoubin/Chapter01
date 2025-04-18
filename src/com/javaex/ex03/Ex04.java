package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		//if문 안쪽에서 생성된 변수는 if문이 끝나면 사라다
		//따라서 if문 밖에서도 사용할 변수는 if문 빡에서 선언한다		
		int sum;
		
		if(time <=8) {
			sum =  time *10000; 
						
		}else {
			sum = (time-8)*12000 + 8*10000;
			
		}
		
		System.out.println("임근은 "+sum+ "원 입니다.");
	
		sc.close();

	}

}
