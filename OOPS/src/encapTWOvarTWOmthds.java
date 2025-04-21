class ENCC
{
int X=3;
int Y=6;
public void add()
{
int r=X+Y;
	System.out.println("The addition of two numbers is X+Y="+ r);	
}
public void mult()
{
int e=X*Y;
	System.out.println("The multiplication of two numbers is X+Y="+ e);	
}
}
public class encapTWOvarTWOmthds {

	public static void main(String[] args) {
		ENCC OBJ=new ENCC();
		System.out.println("    ADDITION");
		System.out.println("The variable X="+OBJ.X+" The variable Y="+OBJ.Y);
		OBJ.add();
		System.out.println(" ");
		System.out.println("  MULTIPLICATION");
		System.out.println("The variable X="+OBJ.X+" The variable Y="+OBJ.Y);
		OBJ.mult();
		}
}
