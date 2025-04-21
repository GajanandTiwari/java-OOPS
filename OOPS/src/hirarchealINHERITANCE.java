class awm
{
public void ammo()
{
int a=20;
System.out.println("a="+a);

}
}
class m24 extends awm
{
public void ammo7()
{
int b=40;
System.out.println("b="+b);


}
}
class kar98 extends awm
{
public void ammo76()
{
	
System.out.println("this is hirarcheal inheritance");	
}
}
public class hirarchealINHERITANCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m24 obj=new m24();
obj.ammo7();
kar98 obj1=new kar98();
obj1.ammo76();
obj1.ammo();
	}

}
