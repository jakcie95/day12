package quiz;

import java.util.Scanner;
class Oven extends TimeQuiz01{
	
}
public class Main {public static void main(String[] args) {
	TimeQuiz01 tq = new TimeQuiz01();
	tq.print();
	Test t = new Test();
	OvenFunc oven = new OvenFunc();
	TimerFunc tf = new TimerFunc();
	int temp;
	int select;
	char a;
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("1. 온도 설정");
		System.out.println("2. 시간 설정");
		System.out.println("3. 공간 설정");
		System.out.println("4. 현재 설정 보기");
		System.out.println("5. 조리 시작");
		System.out.println("6. 종료");
		System.out.print("선택 : ");
		int cho=sc.nextInt();
		switch(cho) {
		case 1:
			System.out.print("온도 : ");
			temp = sc.nextInt();
			oven.setTemp(temp);
			oven.getTemp();
			while(true) {
				
				System.out.println("1. 온도 수정");
				System.out.println("2. 종료");
				System.out.print("선택 : ");
				int cho2=sc.nextInt();
				if(cho2==1) {
					
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
							if(oven.getTemp()>100) {
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
							oven.outTemp();
							break;
						}else {
							System.out.println("Error");
						}
					}
				else if(cho2==2) {
					break;
				}else {
					System.out.println("잘못된 입력");
				}
			}
			break;
		case 2:
			
			System.out.println("1.시 입력");
			System.out.println("2.분 입력");
			System.out.println("3.초 입력");
			select = sc.nextInt();
			while(true) {
				if(select == 1) {
					tf.hour();
					select++;
					continue;
				}else if(select == 2) {
					tf.min();
					select++;
					continue;
				}else if(select == 3) {
					tf.sec();
					
				}else {
					System.out.println("에러 발생");
					continue;
				}
				
				tf.print();
				break;
			}
			
			break;
		case 3:
			while(t.bool) {
				t.select();
				t.setting();
			}
			t.bool=true;
			break;
		case 4:
			oven.outTemp();;
			System.out.print("현재 시간 : ");
			tf.print();
			System.out.println("현재 공간 : "+t.getStr());
			break;
		case 5:
			System.out.println("조리 완료");
			System.out.println("맛있게 드세요~!");
			break;
		case 6:
			System.exit(1);
		default:
			System.out.println("잘못된 입력");
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
}

}
