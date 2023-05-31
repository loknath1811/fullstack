class Sample{
public static void main(String[]args){
int a=5;
int b=9;
System.out.println("a==b="+(a==b));
System.out.println("a!=b="+(a!=b));
System.out.println("a>b="+(a>b));
System.out.println("a<b="+(a<b));
System.out.println("a>=b="+(a>=b));
System.out.println("a<=b="+(a<=b));
System.out.println((a<b)&&(a>b));
System.out.println((a>b)||(a<b));
System.out.println(a&b);
System.out.println(a|b);
System.out.println(a^b);
int res=(a<b)?a+b:a-b;
System.out.println(res);
}
}






