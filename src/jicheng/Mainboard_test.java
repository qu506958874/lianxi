package jicheng;

public class Mainboard_test {
	public static void main(String[] args){
		Mainboard mainboard=new Mainboard();
		Cpu i3=new I3();
		Cpu i5=new I5();
		Cpu i7=new I7();
		mainboard.setCpu(i7);
		mainboard.method();
	}
}
