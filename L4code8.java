class L4code8
{
public static void main(String[] arg)
{
int n,r,rev=0,temp=0;

n=Integer.parseInt(arg[0]);
temp=n;
while(n>0)
{
r=n%10;
rev=(rev*10)+r;
n=n/10;
}
if(temp==rev)
System.out.println("pallindrome number");
else
{
System.out.println("not pallindrome");
}
}
}
