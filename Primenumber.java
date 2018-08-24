class Primenumber
{
public static void main(String[] arg)
{
int a,i,f=0;
a=Integer.parseInt(arg[0]);

{
for(i=2;i<=a/2;i++)
{
if(a%i==0)
{
f=1;
}
}
if(f==1)
{
System.out.println("no is not a prime");
}
else if(f==0)
{
System.out.println("no is a prime");
}

}
}
}