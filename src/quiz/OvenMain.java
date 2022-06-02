package quiz;

import java.util.Scanner;

public class OvenMain {
	public static void main(String[] args) {
		
	
	OvenFunc oven = new OvenFunc();
	int temp;
	char a;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("온도 : ");
	temp = sc.nextInt();
	oven.setTemp(temp);

	while(true) {
		System.out.println("\t온도 조절"
				+ "\n+\t-\tS(Stop)\tI(Input)");
		a = sc.next().charAt(0);
		
		if(a == '+') {
			if(oven.getTemp() < 300) {
				oven.tempFunc('+');	
			}else {
				System.out.println("Error : 최고값");
			}
		}else if(a == '-') {
			if(oven.getTemp()>0) {
				oven.tempFunc('-');
			}else {
				System.out.println("Error : 최저값");
			}
			
		}else if(a == 'S' || a == 's') {
			oven.outTemp();
			break;
		}else if(a == 'I' || a == 'i'){
			System.out.println("온도 : ");
			temp = sc.nextInt();
			oven.setTemp(temp);
		}else {
			System.out.println("Error");
		}
	}
}
}

