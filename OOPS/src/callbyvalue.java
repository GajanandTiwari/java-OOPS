class call
{
public void by(int a,double b,char c,String d,boolean e)
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
}
}
public class callbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
call value=new call();
value.by(9, 3.6, 'c', "this is", true);
	}

}
