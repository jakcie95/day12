package day12;

public class TestClass04 {
	private int kor,eng,math,sum;
	private double avg;
	public int getKor() {
		return this.kor;
	}
	public void setKor(int k) {
		this.kor = k;
	}
	public int getEng() {
		return this.eng;
	}
	public void setEng(int e) {
		this.eng = e;
	}
	public int getMath() {
		return this.math;
	}
	public void setMath(int m) {
		this.math = m;
	}
	public void setSum() {
		this.sum =  kor + eng + math;

	}
	public int getSum() {
		return this.sum;
	}
	public double getAvg() {
		return sum/3;
		
	}
}
