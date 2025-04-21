class DATATYPES
{
	char a; String b;
public DATATYPES(char a)
{
System.out.println("the char datatype has been executed "+a);	
}
public DATATYPES(String b)
{
System.out.println("the string datatype has been executed "+b);	
}
}
public class constructoroverloadingDATATYPES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DATATYPES obj=new DATATYPES("hello");
	}

}
