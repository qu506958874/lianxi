package duoxiancheng;

public class Thread2 extends Thread {
	public void run(){
		/*for(int i=1;i<=20;i++){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"小影喝水");
		}*/
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("小影喝水");
	}
}
