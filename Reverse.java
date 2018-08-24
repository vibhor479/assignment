class Reverse
{
public static void main(String[] arg)

{
int n,r,rev=0;
n=Integer.parseInt(arg[0]);
while(n>0)
{
r=n%10;
rev=(rev*10)+r;
n=n/10;
}
System.out.println("the reverse of a number is="+rev);

}
}

