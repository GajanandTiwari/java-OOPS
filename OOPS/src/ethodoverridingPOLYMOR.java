class mint
{
	int a;
public void hello(int a,int b)
{
	System.out.println(a+" "+b);
}
public void hello(int c,int d,int e)
{
	System.out.println(c+" "+d+" "+e);
}
}
public class ethodoverridingPOLYMOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mint obj=new mint();
obj.hello(9,8);
obj.hello(6, 7,8);
	}

}
