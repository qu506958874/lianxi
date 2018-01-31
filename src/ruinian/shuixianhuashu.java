package ruinian;

public class shuixianhuashu {
	public static void main(String[] args){
		for(int i=100;i<=999;i++){
			int b=i/100;
			int s=(i%100)/10;
			int g=i%10;
			if(Math.pow(g, 3)+Math.pow(s, 3)+Math.pow(b, 3)==i){
				System.out.println(i);
			}
			
		}
	}
}
