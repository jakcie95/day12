package day12;

import java.util.Scanner;

/*
하나의 클래스에는 하나의 public만 쓸수있음
public 이 붙지 않은 클래스는 외부에서 접근 불가.
생성자
- 클래스 이름과 동일한 메소드
- * 반환타입은 없다
- * 값을 초기화 하는 용도로 사용한다.
- 객체 생성시 호출되는 메소드 이다.
- 생성자도 메소드 이기 때문에 오버로딩이 가능하다
*/
class AAA{
	private String version;
	public AAA() {
		System.out.println("생성자 실행");
	}
	public AAA(String v) {
		System.out.println(v+" : v 생성자");
		version = v;
	}
}

public class MainClass05 {

	public static void main(String[] args) {
		AAA a = new AAA("10");
		AAA b = new AAA();
		
		String s = "aaaa";
		String ss = new String("안녕하세요");
		System.out.println(ss);
		Scanner sc = new Scanner(System.in);
	}

}







