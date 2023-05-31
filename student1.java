package DAY9;

public class student1 {
	private String name;
	private int age;
	private String Department;
	public student1(String studentName,int studentAge,String studentdepartment)
	{
		name=studentName;
		age=studentAge;
		Department=studentdepartment;
	}
	public String getname()
	{
	return name;
	}
	
	public int getage()
	{
	return age;
	}
	public String getDepartment()
	{
		return Department;
	}
		public static void main(String[] args) {
			student1 s2=new student1("vanitha",20,"cse");
			student1 s3=new student1("jessy",19,"civil");
			System.out.println("student2:" );
			System.out.println("name:" +s2.getname());
			System.out.println("age:" +s2.getage());
			System.out.println("deparment:"+s2.getDepartment());
			System.out.println("student3:");
			System.out.println("name:"+s3.getname());
			System.out.println("age:"+s3.getage());
			System.out.println("department:"+s3.getDepartment());
			
		}
	}


