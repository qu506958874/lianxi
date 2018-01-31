package ruinian;

public class zhishu {
	public static void main(String[] args){
		int result=0;
		for(int i=2;i<=100;i++){
			int b=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					b++;	
				}
			}
			if(b==0){
				result+=i;
			}
		}
		System.out.println(result);
	}
	public zhishu(){};
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
		int result=0;
		for(int i=2;i<=a;i++){
			int b=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					b++;
				}
			}
			if(b==0){
				result+=i;
			}
		}
		System.out.println("1~"+a+"ÖÊÊýºÍ:"+result);
	}
	
}
