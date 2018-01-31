package ruinian;

public class zuidagongyueshu {
	public static void main(String[] args){
		//最大公约数和最小公倍数
		int i=100;
		int j=70;
		if(i>j){
			int m=i;
			for(int a=j;a>0;a--){
				if(j%a==0&&i%a==0){
					System.out.println("最大公约数:"+a);
					break;
				}
			}
			for(int c=i;c<=i*j;c+=m){
				if(c%i==0&&c%j==0){
					System.out.println("最小公倍数:"+c);
					break;
				}
			}
		}else{
			int m=j;
			for(int b=i;b>0;b--){
				if(i%b==0&&j%b==0){
					System.out.println("最大公约数:"+b);
					break;
				}
			}
			for(int c=j;c<=i*j;c+=m){
				if(c%j==0&&c%i==0){
					System.out.println("最小公倍数:"+c);
					break;
				}
			}
		}
		//求1/(2*3)+1/(3*4)+……+1/((n-1)*n)的值
		int n=20;
		double f=0;
		for(double e=3;e<=n;e++){
			f+=1/((e-1)*e);
		}
		System.out.println(f);
		
	}
}
