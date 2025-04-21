class encap
{
	int s=3;
	int h=6;
	int r=s+h;
	public void add()
	{
		System.out.println("the addition of two  numbers is "+r);
	}
}
public class encapsulationTWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
encap e=new encap();
System.out.println("adding "+e.s+" and "+e.h);
e.add();
	}

}
