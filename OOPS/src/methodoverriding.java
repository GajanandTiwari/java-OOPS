class girraffe
{
int a;
public void grass(int a)
{
	a++;
System.out.println(a);	
}
}
class deer extends girraffe
{
public void grass()
{
	a--;
System.out.println("class deer has executed the value is "+a);	
}
}
public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
deer obj=new deer();
obj.grass(6);
	}

}
