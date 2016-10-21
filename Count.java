import java.util.*;
class Count
{
public static void main(String args[])
{
int num,r,c=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
if(num>0)
{
while(num!=0)
{
r=num%10;
c++;
num=num/10;
}
System.out.println("Number of digits:"+c);
}
else
{
System.out.println("Invalid data");
}
}
}
