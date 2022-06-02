package day12;

public class MainClass02 {
public static void main(String[] args) {
	TestClass02 t = new TestClass02();
//t.str = "안녕하세요";

t.setting("홍길동");
String s = t.getter();
System.out.println(s);
}
}
