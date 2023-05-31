import java.util.Scanner;
public class Third{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int i,sum=0;
while(true)
{
i=sc.nextInt();
if(i<0) {
break;
}
else {
sum+=i;
}
}
System.out.println(sum);
}
}
