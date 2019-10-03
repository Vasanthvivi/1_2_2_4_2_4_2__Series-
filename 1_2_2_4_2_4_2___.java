import java.util.*;
class prr
{
public static void main(String args[])
{
int k=0;
Scanner ss=new Scanner(System.in);
int arr[]=new int[100];
for(int a=1;a<100;a++)
{
int count=0;
for(int b=1;b<100;b++)
{
 if(a%b==0)
 {
 count++;
 }
}
if(count==2)
 {
 arr[k]=a;
 k++;
 }
}
int saa[]=new int[100];
int tem=0;
try
{
for(int as=0;as<arr.length;as++)
{
for(int sa=0;sa<arr.length-as-1;sa++)
{
saa[tem]=(arr[sa+1]-arr[sa]);
tem++;
}
}
}catch(Exception e)
{
}
System.out.println("Enter the no");
int num=ss.nextInt();
for(int g=0;g<num;g++)
{
System.out.println(saa[g]);
}
}
}