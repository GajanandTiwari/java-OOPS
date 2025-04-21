class sequence
{
	int a;double b;
public sequence(int a,double b)	
{
System.out.println("first sequence has been executed"+a+" "+b);

}
public sequence(double b,int a)
{
System.out.println("2nd sequence has been executed "+b+" "+a);	
}
}
public class contstructoroverloadingSEQUENCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sequence obj=new sequence(9,7.3);
	}

}
