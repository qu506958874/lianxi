package ∂‡Ã¨;

public class School {
	private Teacher teacher;
	private Student student;
	private String name;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void method1(){
		teacher.method(name);	
	}
	public void method2(){
		student.method(name);
	}
}
