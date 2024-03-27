import java.util.*;
class A
{
static double calcTotExpense(int quant,double price)
{
double totExp=quant*price;
if (quant>50)
{
totExp*=0.90; //10% discount
}
else if(quant>=25 && quant<=50)
{
totExp*=0.95; //5% discount
}
return totExp;
}
}
class Expenses
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter quantity purchased:");
int quant=sc.nextInt();
System.out.print("Enter price per item:");
double price=sc.nextDouble();
double totExpen=A.calcTotExpense(quant,price);
System.out.print("Total expenses:$"+totExpen);
}
}