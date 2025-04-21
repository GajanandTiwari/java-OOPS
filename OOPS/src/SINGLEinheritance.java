class yes
{
int x=10;
public void show()
{
	int y=8;
System.out.println(x+y);	
}
}
class shift extends yes
{
public void demo()
{
	System.out.println("additino of two numbers ");	
}
}
public class SINGLEinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shift obj=new shift();
obj.show();
obj.demo();
	}

}
