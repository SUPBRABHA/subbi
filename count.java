import java.util.*;
import java.io.*;
class count
{
public static void main(String args[])
{
int num=1234,count=0;
while(num!=0)
{
num=/10;
++count;
}
System.out.println("Number of digits is:"+count);
}
}
