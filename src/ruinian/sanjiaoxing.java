package ruinian;

public class sanjiaoxing {
	public static void main(String[] args){
		int a=4;
		for(int i=1;i<=a;i++){
			for(int j=a-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			for(int q=a-i;q>0;q--){
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
	public sanjiaoxing(){};
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
		for(int i=1;i<=a;i++){
			for(int j=a-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			for(int q=a-i;q>0;q--){
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
	
}
