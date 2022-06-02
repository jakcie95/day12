package quiz;

import java.util.Scanner;

public class TimerFunc {
	public int h, m, s;
	
	Scanner sc = new Scanner(System.in);
	public int hour() {
		System.out.println("시간 입력");
		h = sc.nextInt();
		if(h <= 10) {
			System.out.println(h+ "시간");
		}else {
			System.out.println("에러 발생");
		}
		return h;
	}
		
		public int min() {
			System.out.println("분 입력");
			m = sc.nextInt();
			if(m <= 59) {
				System.out.println(m+"분");
			}else {
				System.out.println("에러 발생");
			}
			return h;
		}
		public int sec() {
			System.out.println("초 입력");
			s = sc.nextInt();
			if(s <= 59) {
				System.out.println(s+"초");
			}else {
				System.out.println("에러 발생");
			}
			return s;
		}
		public void print() {
			System.out.println(h+"시간"+m+"분"+s+"초");
			System.out.println("조리 시작");
			
		}
		
		}

	


