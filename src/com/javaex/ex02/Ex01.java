package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		
		//println 커서 엔터 표현
		System.out.println("안녕");
		System.out.println("하세요");
		
		//print 커서 엔터 표현안함
		System.out.print("안녕");
		System.out.println("하세요");
		
		/*System.out.println("");*/
		System.out.println("------------------------------");
		
		int i =13245;
		double d = 3.14;
		char c = '한';
		
		String s = "한";
		String str = "굿모닝";
		String name = "임유빈";
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(5+3);
		System.out.println("굿모닝"+"임유빈");
		System.out.println(str+name);
		System.out.println(str+name+str);
		
		System.out.println(i+i); //정수 + 정수
		System.out.println(1+d);	//정수 + 실수 ==>실수(자동형변환)=실수
		System.out.println(str+i);
		
		String result = name + d;	//문자열 +정수 문자열 +실수는 문자열
		System.out.println(result);
		
		//굿모닝랑임유빈   str + "랑" + name 
		System.out.println(str + "랑" + name);
		
		//굿모닝랑임유빈   str + " " + name
		System.out.println(str +" 랑 " + name);
		
		//굿모닝 임유빈	str + " " +name
		System.out.println(str+ " " +name);
		
		//제이름은 임유빈 입니다
		System.out.println("제이름은"+ " " +name+" "+"입니다");
		
		System.out.println("------------------------");
		System.out.println(s);	//한
		System.out.println(s+s);	//한한 char형(은 
		
		//제이름은 "임유빈" 입니다 \(돈표시)
		System.out.println("제이름은 \""+name+"\" 입니다.");
		
		//제이름은 '임유빈' 입니다
		System.out.println("제이름은 '"+name+"' 입니다.");
		
		//제이름은 \임유빈 입니다
		System.out.println("제이름은 \\"+name+" 입니다.");
		
		System.out.println("제이름은\t" +name+ " 입니다.");
		System.out.println("제이름은\n" +name+ " 입니다.");
		

	}

}
