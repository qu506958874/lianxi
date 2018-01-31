package ruinian;

public class nishu {

	public static void main(String[] args) {
		int i=2349;
		int q=i/1000;
		int b=(i%1000)/100;
		int s=(i%100)/10;
		int g=i%10;
		int j=g*1000+s*100+b*10+q;
		System.out.println(j);

	}
	public nishu(){};
	private int i;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
		int q=i/1000;
		int b=(i%1000)/100;
		int s=(i%100)/10;
		int g=i%10;
		int j=g*1000+s*100+b*10+q;
		System.out.println("ÄæÊıÎª:"+j);
	}
	
	

}
