class L4code7
{
public static void main(String[] args)
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);

if(a>b && a>c)
{
System.out.println("a is grater");
}
else if(b>c && b>a)
{
System.out.println("b is grater");
}
else
{
System.out.println("c is grater");
}
}
}
