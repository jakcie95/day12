package quiz;

import java.util.Scanner;

public class Test {
	private int sel;
	private String str="1단";
	public boolean bool=true;
	public void select() {
		Scanner input=new Scanner(System.in);
		System.out.println("사용 위치 설정 (기본 1단)");
		System.out.println("1. 1단");
		System.out.println("2. 2단");
		System.out.println("3. 모두");
		System.out.print("입력 : ");
		this.sel=input.nextInt();
		
	}
	public void setting() {
		if(this.sel==1) {
			System.out.println("1단을 사용합니다.");
			this.str="1단";
			this.bool=false;
		}else if(this.sel==2) {
			System.out.println("2단을 사용합니다.");
			this.str="2단";
			this.bool=false;
		}else if(this.sel==3) {
			this.str="1단, 2단";
			System.out.println("1단, 2단을 사용합니다.");
			this.bool=false;
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	public String getStr() {
		return this.str;
	}
	
}
