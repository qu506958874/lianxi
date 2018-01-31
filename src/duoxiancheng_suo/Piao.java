package duoxiancheng_suo;

public class Piao implements Runnable {
	int i=20;
	Object lock=new Object();
	
	public synchronized void xiaoshou(){
		
		if(i>0){
			System.out.println(Thread.currentThread().getName()+"ÂôÁËµÚ"+i+"ÕÅÆ±");
			i--;
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(i>0){
			
			xiaoshou();
			
		}
	}
	
	
}
