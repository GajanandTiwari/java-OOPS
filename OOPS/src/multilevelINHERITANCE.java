class dbs
{
public void gauge()
{
int a=3;
System.out.println("a="+a);
}
}
class m416 extends dbs
{
public void ammo5()
{
	int b=6;
	System.out.println("b="+b);
}
}
class akm extends m416
{
public void ammo7()
{
System.out.println("these are two numbers");	

}
}

public class multilevelINHERITANCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
akm obj=new akm();
obj.gauge();
obj.ammo5();
obj.ammo7();
	}

}
