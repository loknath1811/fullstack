package day13;
interface A{
	public void meth1();
	public void meth2();
	public void meth3();
}
abstract class B implements A{
	public void meth1() {
		System.out.println("B is using A interface");
	}
}
class C extends B{
	public void meth2() {
		System.out.println("C is using B interface");
	}
public void meth3() {
System.out.println("method3 in c");
}
}
public class interf {
	public static void main(String[] args) {
		C obj=new C();
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
}
