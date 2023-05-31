package day13;
class Student{
	int rollno;
	String name;
	static String college="CBIT";
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+","+name+","+college);
		}
}
public class stat {
	public static void main(String[] args) {
		Student s1=new Student(111,"Kavya");
		Student s2=new Student(222,"Jessy");
		s1.display();
		s2.display();
	}
}
