package duoxiancheng;

public class Test {
	public static void main(String[] args){
//		Thread t1=new Thread1();
//		Thread t2=new Thread2();
//		Runnable r=new Thread3();
//		Thread t3=new Thread(r);
		int a=0;
		int b=0;
		int c=0;
		while(a+b+c<=10){
			Thread t1=new Thread1();
			Thread t2=new Thread2();
			Runnable r=new Thread3();
			Thread t3=new Thread(r);
			t1.start();
			a++;
			t2.start();
			b++;
			t3.start();
			c++;
		}
		System.out.println("真是个瓜皮！就知道吃饭睡觉！");
		
	}
	
}
