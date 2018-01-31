package 多态;

public class Math implements Teacher {
	public void method(String name){
		System.out.println(name+"是数学老师");
	}
}
