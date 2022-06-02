package day12;
/*
 this
 - 클래스 메소드의 0번쨰 매개변수
 - 자동으로 생성된다.
 - 자기자신의 값을 가지고 있다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		/*
		System.out.println(t);
		t.func();
		t.str = "안녕하세요";
		t.func03();
		t.func04();
		*/
		t.setStr();
	}
}
