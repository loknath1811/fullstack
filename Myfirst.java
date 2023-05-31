import java.util.Scanner;
class Myfirst
{
public static void main (String[]args)
{
int year;
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
year=sc.nextInt();
if(year%4==0&&((year%400==0)||(year%100!=0)))
System.out.println("leap year");
else
System.out.println("it is not a leap year");
}
}