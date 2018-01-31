package duoxiancheng;

import java.util.Scanner;

public class Kongzhitaishuru {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄĞÕÃû£º");
		String str=scanner.nextLine();
		Cat<String> person=new Cat<String>();
		person.method(str);
		Thread t1=new Thread1();
		Thread t2=new Thread2();
		Runnable r=new Thread3();
		Thread t3=new Thread(r);
		t1.start();
		t2.start();
		t3.start();
	}
}
