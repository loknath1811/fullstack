package day13;
interface A{
	public void meth();
}
class B implements A{
	public void meth() {
		System.out.println("B is using A interface");
	}
}
public class main {
public static void main(String[] args) {
	B obj=new B();
	obj.meth();
}
}
