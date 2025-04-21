class one
{
public float raw()
{
float a=15.9f;
a++;
return a;
}
public int baked()
{
int b=9;
b++;
return b;
}
}
public class RETURN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
one obj=new one();
float d=obj.raw();
System.out.println(d);

int c=obj.baked();
System.out.println(c);
	}

}
