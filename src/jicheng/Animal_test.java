package jicheng;

public class Animal_test {
	public static void main(String[] args){
		Cat cat1=new Cat();
		Animal ani=new Animal();
		Ying ying1=new Ying();
		cat1.setName("¥Û¡≥√®");
		System.out.println("√®Ω–£∫"+cat1.getName());
		cat1.setAge(10);
		System.out.println("ƒÍ¡‰£∫"+cat1.getAge()+"ÀÍ");
		ani.method();
		System.out.print("but");
		cat1.method();
		cat1.eat();
		System.out.println();
		ying1.setName("–°ª“");
		System.out.println("”•Ω–£∫"+ying1.getName());
		ying1.setAge(10);
		System.out.println("ƒÍ¡‰£∫"+ying1.getAge()+"ÀÍ");
		ani.method();
		System.out.print("but");
		ying1.method();
		
		}
}
