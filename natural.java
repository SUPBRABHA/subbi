import java.util.*;
import java.io.*;
import java.util.Scanner.*;
class natural
{
public static void main(Strng args[])
{
int num,count,total=0;
System.out.println("enter an integer");
Scanner s=new Scanner(System.in);
num=s.readLine();
for(count=1;count<=num;count++)
{
total=total+count;
}
System.out.println("sum of natural numbers"+total);
}
}
