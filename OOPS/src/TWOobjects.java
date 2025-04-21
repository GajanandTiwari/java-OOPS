class TWO
{
int W=33;
int H=66;
public void add()
{
	System.out.println("ADDITION:-  W+H = "+ (W+H));
}
public void div()
{
System.out.println("DIVISION:-  H/W = "+ (H/W));	
}

}
public class TWOobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TWO FRY=new TWO();
System.out.println("variable W="+FRY.W+" variable H="+FRY.H);
FRY.add();
System.out.println(" ");
TWO STEAM=new TWO();
System.out.println("variable W="+STEAM.W+" variable H="+STEAM.H);
STEAM.div();

	}
	}
