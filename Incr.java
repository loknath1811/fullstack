public class Incr{
public static void main(String[]args){
double arr[]={10,20,30,40};
double arr1[]=new double[arr.length];
for(int i=0;i<arr.length;i++)
{
arr1[i]=arr[i]*(1.15);
}
for(int i=arr1.length-1;i>=0;i--)
{
System.out.println(arr1[i]+" ");
}
}
}
