package ��̬;

public class School_test {
	public static void main(String[] args){
		School school=new School();
		Teacher chinese=new Chinese();
		school.setTeacher(chinese);
		school.setName("����");
		school.getName();
		school.method1();
		
		Teacher physcal=new Physcal();
		school.setTeacher(physcal);
		school.setName("СӰ");
		school.getName();
		school.method1();
		
		Teacher math=new Math();
		school.setTeacher(math);
		school.setTeacher(physcal);
		school.setName("С��");
		school.method1();
		
		Student xueba=new Xueba();
		school.setStudent(xueba);
		school.setTeacher(physcal);
		school.setName("С��");
		school.method2();
		
		Student xuezha=new Xuezha();
		school.setStudent(xuezha);
		school.setTeacher(physcal);
		school.setName("С��");
		school.method2();
	}
}
