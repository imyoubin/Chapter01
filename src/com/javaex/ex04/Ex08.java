package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		for (int y = 1; y <= 6; y++) {
            // 각 줄마다 i개의 별을 출력
            for (int x = 1; x <= y; x++) {
                System.out.print("*");
            }
            // 한 줄이 끝나면 줄 바꿈
            System.out.println();
		}	
	}
}
