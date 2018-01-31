package ruinian;

public class jiecheng {
	public static void main(String[] args){
		long c=1;
		for(int i=20;i>0;i--){
			c=c*i;
			System.out.println(i);
		}
		System.out.println(c);
	}
	//½×³Ë
	public jiecheng(){};
	private int k;
	public long getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
		long c=1;
		for(int i=k;i>0;i--){
			c=c*i;
			System.out.println(i);
		}
		System.out.println(c);
	}
	
	
}
