package duoxiancheng_suo;

public class Test {
	public static void main(String[] args){
		Runnable piao=new Piao();
		Thread t1=new Thread(piao);
		Thread t2=new Thread(piao);
		t1.setName("小影");
		t2.setName("高兴");
		t1.start();
		t2.start();
	}
}
