package com.javaex.ex01;

public class Ex01 {
	
	
	public static void main(String[] args) {	
		int myAge;              //선언	
			myAge = 25; 		//초기화(값을 처음 넣는것		
			System.out.println(myAge);   //화면출력
			myAge = 26;
			System.out.println(myAge);
			
			/*******************************************/
			
		byte no;
			no = 127;    //-128~127까지 사용
			System.out.println(no);
			
	    /* long형
	     * int 범위까지는 L자 않붙혀도 됨
	     * int 범위 벋어나는 경우 L자 붙임
	     * ==>L을 붙혀서 ▲
	     */
			
		long no2;
		 no2 = 345678912345L;  //-9223372036854775808 ~9223372036854775807 까직사용 
		 System.out.println(no2);
		 
		 /*
		 ( String ) number;  // 학번
		 ( String ) name;  // 이름
		 ( boolean ) isEnrolled; // 등록 여부
		 ( float ) grade; // 평점
		 ( String ) address;  // 주소
		 ( String ) major; // 전공
		 ( int ) unit;  // 이수 학점
		 ( boolean ) haveMinor; // 부전공 여부
		 ( String ) juminNo;  // 주민번호(-없이 13자리숫자)
		 ( String ) cellphone; // 핸드폰 번호(-포함한 숫자)
		 ( int ) age; // 나이
		 ( String  ) email; /// 이메일주소
		*/
	}

}
