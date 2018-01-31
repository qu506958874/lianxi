package ruinian;

public class xuanzepaixu {

	public static void main(String[] args) {
		int[] a={45,65,78,98,33,12,88};
		for(int i=0;i<a.length-1;i++){
			for(int j=i;j<a.length-1;j++){
				if(a[i]<a[j+1]){
					int b=a[i];
					a[i]=a[j+1];
					a[j+1]=b;
				}
			}
			for(int c:a){
				System.out.print(c+",");
			}
			System.out.println();
		}
	}
	public xuanzepaixu(){};
	private int[] a;
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
		for(int i=0;i<a.length-1;i++){
			for(int j=i;j<a.length-1;j++){
				if(a[i]<a[j+1]){
					int b=a[i];
					a[i]=a[j+1];
					a[j+1]=b;
				}
			}
			for(int c:a){
				System.out.print(c+",");
			}
			System.out.println();
		}
	}
	
}
