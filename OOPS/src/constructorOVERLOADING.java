class hello
{
	int a; int b;
public hello(int a,int b)	
{
	a++;b--;
	System.out.println("both the values are "+a+" and "+b);
}
public hello(int a)
{
	a--;
System.out.println("only one value is executed "+a);	
}
}

public class constructorOVERLOADING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
hello obj=new hello(18);
	}

}
