package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		for (int y = 1; y < 6; y++) {
            // 안쪽 for문은 각 줄에 별 6개를 출력
            for (int x = 1; x < 6; x++) {
                System.out.print("*"); // 줄 바꿈 없이 별 출력
            }
            System.out.println(); // 한 줄 출력 후 줄 바꿈
			
		}

	}	

}
