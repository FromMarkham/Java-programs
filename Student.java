
public class Student{
	
	private String name;
	private int age;
	private double mark;
	
	public Student(String name,int age,double mark) {
		super();
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getMark() {
		return mark;
	}
	
	public void setStudentName(String setterName) {
		this.name=setterName;
	}
	
	public void setMark(double setterMark) {
		this.mark=setterMark;
	}
	
	public void setAge(int setterAge) {
		this.age=setterAge;
	}
	
	@Override
	public String toString() {
		return "Student[name"+name+",age"+age+",mark"+mark+"]";
	}
	
}
