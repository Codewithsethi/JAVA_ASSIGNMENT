/*Section5:Write a java program to find following without using looping and decision 
making(VII). Find left shit, right shift and zero fill of summation of all digits of any 
4 digit number and it will be shifted by 3rd digit of any 4 digit 
number?*/
import java.util.*;
class Section5_vii
{
public static void main(String arg[])
{ 
Scanner sc=new Scanner(System.in);
int n1,n,d3=0,ls=0,rs=0,zf=0;
System.out.print("Enter a 4-digit number:");
n=sc.nextInt();
n1=n;
d3=(n1/10)%10;
ls=n<<d3;
rs=n>>d3;
zf=n>>>d3;
System.out.println("Left shift shifted by\s"+d3+"\s,then value is:"+ls);
System.out.println("Right shift shifted by\s"+d3+"\s,then value is:"+rs);
System.out.println("zero fill shifted by\s"+d3+"\s,then value is:"+zf);
}
}