package ruinian;

public class ruinian {
	public static void main(String[] args){
		int year=1900;
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
			
		}
	}
	//����
	public ruinian(){};
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
			
		}
	}
	
}
