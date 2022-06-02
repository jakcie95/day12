package quiz;

import java.util.Scanner;

public class TimerMain2 {

public static void main(String[] args) {
	
	//시간 입력 기능
	//시간 = 최대 10시간, 분 =최대 59분, 초 = 최대 59초,
	//각각 입력받아서 출력
	
	TimerFunc tf = new TimerFunc();
	Scanner sc = new Scanner(System.in);
	int select;
	
	while(true) {
		System.out.println("1.시간 입력");
		System.out.println("2.분 입력");
		System.out.println("3.초 입력");
		select = sc.nextInt();
		if(select == 1) {
			tf.hour();
			continue;
		}else if(select == 2) {
			tf.min();
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
	}
	
}
