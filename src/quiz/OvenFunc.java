package quiz;

public class OvenFunc {
	private int temp=180;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		if(temp <= 300) {
			this.temp = temp;
			
		}else {
			System.out.println("최대 온도는 300℃ 입니다.");
		}
	}
	
	public void tempFunc(char pm) {
		if(pm == '+') {
			temp += 1;
		}else {
			temp -= 1;
		}
		outTemp();
	}
	public void outTemp() {
		System.out.println("현재 온도 : "+temp+"℃");
	}	
}
