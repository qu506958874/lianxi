package jicheng;

public class Animal_test {
	public static void main(String[] args){
		Cat cat1=new Cat();
		Animal ani=new Animal();
		Ying ying1=new Ying();
		cat1.setName("����è");
		System.out.println("è�У�"+cat1.getName());
		cat1.setAge(10);
		System.out.println("���䣺"+cat1.getAge()+"��");
		ani.method();
		System.out.print("but");
		cat1.method();
		cat1.eat();
		System.out.println();
		ying1.setName("С��");
		System.out.println("ӥ�У�"+ying1.getName());
		ying1.setAge(10);
		System.out.println("���䣺"+ying1.getAge()+"��");
		ani.method();
		System.out.print("but");
		ying1.method();
		
		}
}
