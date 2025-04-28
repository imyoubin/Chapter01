package com.javaex.ex05;

public class Ex11 {

	public static void main(String[] args) {
		
		int[] lefrArray = new int[] {10,20,30};
		int[] rightArray = new int[] {10,20,30};
		
		if(lefrArray.length ==rightArray.length) {
			//세부비교 갯수가 같은 상황
			for(int i =0; i<lefrArray.length; i++ ) {
				if(lefrArray[i]==rightArray[i]) {
					//두값이 다르면 일함				
					System.out.println(i +" 번째 값이 다릅니다.");
				}
				
			}
		}else {
			System.out.println("두번째의 크기가 다릅니다.");
			
		}
		

	}

}
