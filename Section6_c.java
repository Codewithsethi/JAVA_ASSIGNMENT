/*Section6:6. Write a java program to find following using conditional operator and 
without using looping and decision making(c) Difference between average of all even digits except divisible by 4 and 
avearge of all odd digits except divisble by 3 of any 4 digit number*/
import java.util.*;
class Section6_c
{
public static void main(String arg[])
{
int n,d=0,c_ed=0,c_od=0,t_ed=0,t_od=0;
int a_ed=0,a_od=0,diff=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a 4-digit number:");
n=sc.nextInt();
d=n%10;
c_ed+=(d%2==0&&d%4!=0)?1:0;
c_od+=(d%2!=0&&d%3!=0)?1:0;
t_ed+=(d%2==0&&d%4!=0)?d:0;
t_od+=(d%2!=0&&d%3!=0)?d:0;
n=n/10;
d=n%10;
c_ed+=(d%2==0&&d%4!=0)?1:0;
c_od+=(d%2!=0&&d%3!=0)?1:0;
t_ed+=(d%2==0&&d%4!=0)?d:0;
t_od+=(d%2!=0&&d%3!=0)?d:0;
n=n/10;
d=n%10;
c_ed+=(d%2==0&&d%4!=0)?1:0;
c_od+=(d%2!=0&&d%3!=0)?1:0;
t_ed+=(d%2==0&&d%4!=0)?d:0;
t_od+=(d%2!=0&&d%3!=0)?d:0;
d=n/10;
c_ed+=(d%2==0&&d%4!=0)?1:0;
c_od+=(d%2!=0&&d%3!=0)?1:0;
t_ed+=(d%2==0&&d%4!=0)?d:0;
t_od+=(d%2!=0&&d%3!=0)?d:0;
a_ed=t_ed/c_ed;
a_od=t_od/c_od;
diff=a_ed-a_od;
System.out.print("Difference is:"+diff);
}
}