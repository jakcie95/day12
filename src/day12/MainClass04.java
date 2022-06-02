package day12;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		int k,e,m;
		//국, 영, 수,합,평균
		//각 셋 ,게터 생성, 연산하는 메소드 생성
		TestClass04 t = new TestClass04();
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 성적 입력 : ");
		k =sc.nextInt();
		System.out.println("영어 성적 입력 : ");
		e = sc.nextInt();
		System.out.println("수학 성적 입력 : ");
		m = sc.nextInt();
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.setSum();
		System.out.println("국어 성적은 : " + t.getKor());
		System.out.println("영어 성적은 : " + t.getEng());
		System.out.println("수학 성적은 : " + t.getMath());
		System.out.println("총합 점수는 : " + t.getSum());
		System.out.println("평균 점수는 : " + t.getAvg());
		
		
	}
}
