class australia
{
	float a; int b;
	public void wwc(float a,int b)
	{
		System.out.println(a+" "+b);
	}
	public void wwc(int b,float a)
	{
		System.out.println(b+" "+a);
	}
}
public class methodoverloadingSEQUENCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
australia win=new australia();
win.wwc(9.9f,7);
win.wwc(6, 18.7f);
	}

}
