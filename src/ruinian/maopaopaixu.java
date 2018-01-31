package ruinian;

public class maopaopaixu {
	public static void main(String[] args){
		int[] a={45,65,78,98,33,12,88};
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					int c=a[j];
					a[j]=a[j+1];
					a[j+1]=c;
				}
			}
			for(int b:a){
				System.out.print(b+",");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		int[] arr={45,65,66,88,11,77,55};
		for(int y=0;y<arr.length-1;y++){
			for(int k=0;k<arr.length-1-y;k++){
				if(arr[k]<arr[k+1]){
					int c=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=c;
				}
			}
			for(int t:arr){
				System.out.print(t+",");
			}
			System.out.println();
		}
		
		
		
	}
	public maopaopaixu(){};
	private int[] a;
	public int[] getA() {
		return a;
		
	}
	public void setA(int[] a) {
		this.a = a;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					int c=a[j];
					a[j]=a[j+1];
					a[j+1]=c;
				}
			}
			for(int b:a){
				System.out.print(b+",");
			}
			System.out.println();
		}
	
	}
}
