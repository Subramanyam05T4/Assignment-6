import java.util.*;
class Divison
	{
		public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if (n%7==0 && n%3==0)
{
System.out.print(n+"is divisible by both 7 and 13");
int q7=n/7;
int r7=n%7;
int q13=n/13;
int r13=n%13;
System.out.print("Quotient when divided by 7 is:"+q7);
System.out.print("Remainder when divided by 7 is:"+r7);
System.out.print("Quotient when divided by 13 is:"+q13);
System.out.print("Remiander when divided by 13 is:"+r13);
}
else
{
System.out.println(n+" is not divisible by both 7 and 13");
}
}
}